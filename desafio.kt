// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(
    var nome : String,
    var email:String,
    var senha: String

) {
    constructor() : this("","","") //construtor vazio;
}

data class ConteudoEducacional(
    private var nome: String,
    private var duracao: Int,
    private var nivelDificuldade: Nivel
)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {

        inscritos.add(usuario) // adicionando alunos a Formação
        //("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {

    val usuario1 = Usuario()
    val usuario2 = Usuario()
    val usuario3 = Usuario()

    val aula1=ConteudoEducacional("aula1",60,Nivel.BASICO)
    val aula2=ConteudoEducacional("aula2",60,Nivel.INTERMEDIARIO)
    val aula3=ConteudoEducacional("aula3",60,Nivel.DIFICIL)

    val formacao1 = Formacao("Desenvolvendo Kotlin ", listOf(aula1,aula2,aula3))// adicionando conteúdo a formação

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)
    var aluno1Matriculado: Boolean
    aluno1Matriculado  = formacao1.inscritos.contains(usuario1)// verificando se aluno está matriculado
    println(aluno1Matriculado)












    //("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

