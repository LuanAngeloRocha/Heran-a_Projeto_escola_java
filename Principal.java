public class Principal {
 
    
public static void main(String[]args){
    Aluno a = new Aluno();
    Professor p = new Professor();

    // dados do aluno 
    a.setNome("Luan Angelo");
    a.setEndereco("Rua SHin Ititaro ");
    a.setTelefone("18996206138");
    a.setCpf("6548.6548.654.98");
//Notas do aluno 
    a.setCursos("Big Data");
    a.setNotas(10.0);
    a.setNotas(8.5);

    // Prints 
    System.out.println("o aluno : ");
    System.out.println(a.getNome());
    System.out.println(a.getEndereco());
    System.out.println(a.getTelefone());
    System.out.println(a.getCpf());
    System.out.println(a.getCursos());

    if ( a.verificaaprovado()){
        System.out.println("Aprovado");

    }else{
        System.out.println("Reprovado");
    }
}



}
