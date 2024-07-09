@startuml
class LaudoMedico {
    float temperatura
    float peso
    float altura
}

class Servico {
    String descricao
    String nome
    String telefone
    String tipo
}

class Reserva {
    Date dataPrevista
    float valor
}

class Acomodacao {
    float valor
    String descricao
}

class RegistroViagem {
    Date dataChegada
    Date dataPartida
    Date dataPrevistaPartida
}

class Passeio {
    String descricao
    String nome
    String valor
}

class Endereco {
    String pais
    String latitude
    String longitude
}

class PontoTuristico {
    String descricao
    String imagem
    String nome
    String valor
}

class Planeta {
    String nome
    String constelacao
}  

class Especie {
    String nome
    String descricao
}

class Turista {
    String nome
    String registroInterplanetario
    Endereco endereco
}

Turista<->Endereco

@enduml