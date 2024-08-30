$(document).ready(function() {
    $('#createForm').on('submit', function(event) {
        event.preventDefault();
        const formData = $(this).serializeArray();
        const jsonData = convertToJSON(formData);
		console.log(jsonData);
        sendRequest(jsonData);
    });

    $('#readButton').on('click', function() {
        const jsonData = { action: 'read' };
        sendRequest(jsonData, displayReadResult);
    });

    $('#updateForm').on('submit', function(event) {
        event.preventDefault();
        const formData = $(this).serializeArray();
        const jsonData = convertToJSON(formData);
        sendRequest(jsonData);
    });

    $('#deleteForm').on('submit', function(event) {
        event.preventDefault();
        const formData = $(this).serializeArray();
        const jsonData = convertToJSON(formData);
        sendRequest(jsonData);
    });

    function convertToJSON(formData) {
        const jsonData = {};
        $.each(formData, function() {
            jsonData[this.name] = this.value;
        });
        return jsonData;
    }

    function sendRequest(jsonData, callback) {
        $.ajax({
            url: 'empJsonserver3.jsp',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(jsonData),
            success: function(data) {
                if (callback) {
                    callback(data);
                } else {
                    alert(JSON.stringify(data));
                }
            },
            error: function(error) {
                console.error('Error:', error);
            }
        });
    }

    function displayReadResult(data) {
        $('#readResult').html(JSON.stringify(data, null, 2));
    }
});