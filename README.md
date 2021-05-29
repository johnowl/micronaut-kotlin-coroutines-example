## Exemplo de como não bloquear a thread do Netty usando suspend functions

O projeto possui duas APIs, uma usando `suspend functions` e outra que não usa. O blockround foi instalado e ele exibe uma exception caso a thread seja bloqueada.

Para ver a thread sendo bloqueada acesse "http://localhost:8080/"

Para ver a thread rodando sem bloqueios acesse "http://localhost:8080/suspend"