public class Solo {
    //Atributos
    String TipoSolo;
    String cor;
    boolean fertil;
    //Método
    public Planta gerarPLanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
