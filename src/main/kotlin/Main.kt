//
//1. Crie um sistema de lista de alunos, onde cada aluno possua uma média e um nome
////
fun main( args : Array<String>){
    exercicio1()
//    exercicio2()
}

fun exercicio1(){
    println("roda exercicio 1")
}

fun exercicio2(){
    println("roda exercicio 2")
}

//
//fun exercicio1() {
//    var listaAluno = mutableListOf<Aluno>()
//    var denis = Aluno("Denis", 9)
//    var max = Aluno("Max", 7)
//    listaAluno.add(denis)
//    listaAluno.add(max)
//
//    for (aluno in listaAluno) {
//        println("nome: ${aluno.nome} - media: ${aluno.media}")
//    }
//
//}
//
//    class Aluno {
//        var nome: String
//        var media: Int
//
//        constructor(nome: String, media: Int){
//            this.nome = nome
//            this.media = media
//        }
//    }

//----------------------------------------------------------------------------------------------------------
//
//
// 2. Crie um sistema de pets onde tenha um dono de pet com um nome e um número de contato,
//e tenha uma lista de pets com os parâmetros, nome, raça e idade;

//
//fun main(args: Array<String>){
//    Pets()
//}
//
//fun Pets(){
//    var listaDono = mutableListOf<Dono>()
//    var popo = Dono("Popo")
//    listaDono.add(popo)
//
//    for ( dono in listaDono){
//        println("nome: ${dono.nome}")
//    }
//}
//
//
//class Dono {
//    var nome: String
//    var telefone: Int
//    var pets: MutableList<Pet>
//
//    constructor(nome: String, telefone: Int, pets: MutableList<Pet>){
//            this.nome = nome
//            this.telefone = telefone
//            this.pets = pets
//    }
//
//}
//
//class Pet {
//    var nome: String
//    var raca: String
//    var idade: Int
//
//    constructor(nome: String, raca: String, idade: Int){
//        this.nome = nome
//        this.raca = raca
//        this.idade = idade
//    }
//}


//-----------------------------------------------------------------------------------------------------------


//3. Crie um sistema de compras onde tenha uma Classe conta, com os atributos nome do cliente,
//total da compra e quantidade de itens e uma lista de produtos com nome do produto, marca e o preço do produto.
//
//class Conta{
//    var agencia: Int
//    var  numero: Int
//    var saldo: Int = 0
//
//    constructor(agencia: Int, numero: Int){
//        this.agencia = agencia
//        this.numero = numero
//
//    }
//
//}

//------------------------------------------------------------------------------------------------------------

//4. Crie um sistema de contas bancárias,
//onde informamos a agência número da conta e o total da conta,
//e possamos sacar um dinheiro ou depositar um valor na conta


//class ContasBancarias{
//    var agencia: Int
//    var numeroDaConta: Int
//    var totalDaConta: Int = 300
//
//    constructor(agencia: Int, numeroDaConta: Int, totalDaConta:  Int = 300){
//        this.agencia = agencia
//        this.numeroDaConta = numeroDaConta
//        this.totalDaConta = totalDaConta
//    }
//
//}
//

//---------------------------------------------------------------------------------------------------------

//5. Crie um sistema de tarefas diárias,
//onde tenha os seguintes atributos,
//tipo de atividade, nome da atividade,
//status de realização da atividade ( true para concluída e false para n concluída).
//Nesse sistema podemos adicionar uma nova atividade e podemos alterar uma atividade para completa ou incompleta


//class tarefasDiarias{
//    var atividade: String
//    var nome: String
//
//    constructor( atividade: String, nome: String){
//        this.atividade = atividade
//        this.nome = nome
//
//    }
//}