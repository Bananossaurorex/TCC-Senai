const form = document.getElementById('formTarefa');
const input = document.getElementById('novaTarefa');
const lista = document.getElementById('listaTarefas');

form.addEventListener('submit', function(event) {
    event.preventDefault();
    const texto = input.value.trim();
    if (texto !== "") {
        adicionarTarefa(texto);
        input.value = '';
    }
});

function adicionarTarefa(texto) {
    const li = document.createElement('li');

    const span = document.createElement('span');
    span.textContent = texto;

    const botoes = document.createElement('div');
    botoes.classList.add('botoes');

    const btnConcluir = document.createElement('button');
    btnConcluir.textContent = '✔';
    btnConcluir.title = 'Marcar como concluída';
    btnConcluir.onclick = () => {
        li.classList.toggle('concluida');
    };

    const btnExcluir = document.createElement('button');
    btnExcluir.textContent = '🗑';
    btnExcluir.title = 'Excluir tarefa';
    btnExcluir.onclick = () => {
        li.remove();
    };

    botoes.appendChild(btnConcluir);
    botoes.appendChild(btnExcluir);

    li.appendChild(span);
    li.appendChild(botoes);

    lista.appendChild(li);
}