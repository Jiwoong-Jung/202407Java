$(document).ready(function() {
    const todoInput = $('#todo-input');
    const todoList = $('#todo-list');

    function addTodo() {
        const todoText = todoInput.val().trim();
        if (todoText === '') {
            alert('Please enter a todo');
            return;
        }

        const li = $('<li></li>').text(todoText);
        const deleteButton = $('<button></button>').text('Delete');

        deleteButton.click(function() {
            li.remove();
        });

        li.append(deleteButton);
        todoList.append(li);

        todoInput.val('');
    }

    $('#add-todo').click(addTodo);

    $('#change-style').click(function() {
        $('body').css('background-color', '#e0f7fa');
        $('.container').css({
            'background-color': '#ffffff',
            'border': '2px solid #00796b'
        });
        $('button').css({
            'background-color': '#00796b',
            'color': '#ffffff'
        });
    });
});