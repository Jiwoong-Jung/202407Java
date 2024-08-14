package com.board.db;

public class Pagination {
    
    private String display;
    private int pageNo;
    private boolean curPage;

    public Pagination(String display, int pageNo, boolean curPage) {
        this.display = display;
        this.pageNo = pageNo;
        this.curPage = curPage;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public boolean isCurPage() {
        return curPage;
    }

    public void setCurPage(boolean curPage) {
        this.curPage = curPage;
    }

	@Override
	public String toString() {
		return "Pagination [display=" + display + ", pageNo=" + pageNo + ", curPage=" + curPage + "]";
	}
    
    
}
