const apiUrl = '/_web0830_2/api/items';

async function createItem() {
    const name = document.getElementById('createName').value;
    const response = await fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json; charset=utf-8'
        },
        body: JSON.stringify({ name })
    });
    const newItem = await response.json();
    alert(`Created item: ${newItem.name} with ID: ${newItem.id}`);
}

async function getAllItems() {
    const response = await fetch(apiUrl);
    const items = await response.json();
    const itemsList = document.getElementById('itemsList');
    itemsList.innerHTML = '';
    items.forEach(item => {
        const li = document.createElement('li');
        li.textContent = `ID: ${item.id}, Name: ${item.name}`;
        itemsList.appendChild(li);
    });
}

async function updateItem() {
    const id = document.getElementById('updateId').value;
    const name = document.getElementById('updateName').value;
    const response = await fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json; charset=utf-8'
        },
        body: JSON.stringify({ name })
    });
    const result = await response.json();
    alert(result.message);
}

async function deleteItem() {
    const id = document.getElementById('deleteId').value;
    const response = await fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
    });
    const result = await response.json();
    alert(result.message);
}