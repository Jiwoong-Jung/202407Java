package board;

import java.sql.*;
import java.time.*;
import java.util.*;

public class BoardDao {

    // DB에 접속하여 Connection 객체를 반환
    private Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");

        return conn;
    }

    // 현재 시간을 문자열 형태로 반환
    private String getCurrentTime() {
        return LocalDate.now() + " " +
               LocalTime.now().toString().substring(0, 8);
    }

    // 게시글 갯수 얻기
    public int getNumRecords() {
        int numRecords = 0;

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "select count(*) from board");
        ) {
            if (rs.next()) {
                numRecords =  rs.getInt(1);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return numRecords;
    }

    // 게시글 리스트 읽기
    public ArrayList<BoardDto> selectList(int start, int listSize) {

        ArrayList<BoardDto> dtoList = new ArrayList<BoardDto>();

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(String.format(
                    "select * from board order by num desc limit %d, %d",
                    start, listSize));
        ) {
            while (rs.next()) {

                // 새 DTO 객체를 만들고 글 데이터를 이 객체에 저장
                BoardDto dto = new BoardDto();

                dto.setNum    (rs.getInt   ("num"    ));
                dto.setWriter (rs.getString("writer" ));
                dto.setTitle  (rs.getString("title"  ));
                dto.setContent(rs.getString("content"));
                dto.setRegtime(rs.getString("regtime"));
                dto.setHits   (rs.getInt   ("hits"   ));

                // 이 DTO 객체를 ArrayList에 추가
                dtoList.add(dto);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return dtoList;
    }

    // 지정된 글 번호를 가진 레코드 읽기
    // hitsIncreased가 true이면 해당 글의 조회수를 1 증가시킴
    //                 false이면 조회수를 증가시키지 않음
    public BoardDto selectOne(int num, boolean hitsIncreased) {

        BoardDto dto = new BoardDto();

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "select * from board where num=" + num);
        ) {
            if (rs.next()) {

                // 글 데이터를 DTO에 저장
                dto.setNum    (rs.getInt   ("num"    ));
                dto.setWriter (rs.getString("writer" ));
                dto.setTitle  (rs.getString("title"  ));
                dto.setContent(rs.getString("content"));
                dto.setRegtime(rs.getString("regtime"));
                dto.setHits   (rs.getInt   ("hits"   ));

                // 이글의 조회수를 증가시켜야 하는 경우
                // (글 보기 화면을 위해 읽을 때)이면 조회수 1 증가
                if (hitsIncreased) {
                    stmt.executeUpdate(
                          "update board set hits=hits+1 where num=" + num);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    // DTO에 담긴 내용으로 새로운 레코드 저장
    public void insertOne(BoardDto dto) {

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(String.format(
                    "insert into board " +
                    "(writer, title, content, regtime, hits)" +
                    "values ('%s', '%s', '%s', '%s', 0)",
                    dto.getWriter(), dto.getTitle(), dto.getContent(),
                    getCurrentTime()));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DTO에 담긴 내용으로 게시글 데이터 업데이트
    public void updateOne(BoardDto dto) {

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(String.format(
                    "update board set writer='%s', title='%s', " +
                    "content='%s', regtime='%s' where num=%d",
                    dto.getWriter(), dto.getTitle(), dto.getContent(),
                    getCurrentTime(), dto.getNum()));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // 지정된 글 번호의 레코드 삭제
    public void deleteOne(int num) {

        try (
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate("delete from board where num=" + num);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}