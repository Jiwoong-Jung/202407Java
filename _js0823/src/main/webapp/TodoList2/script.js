$(document).ready(function() {
    $('#add-todo').click(function() {
        const todoText = $('#todo-input').val().trim();
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
        $('#todo-list').append(li);

        $('#todo-input').val('');
    });
});