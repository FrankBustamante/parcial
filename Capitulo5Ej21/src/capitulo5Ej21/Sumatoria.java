package capitulo5Ej21;

public class Sumatoria {

    int nt, ter, cont, ban;
    public int texto(int nt) { 
        cont = 0; 
        ban = 1;
        ter = 17;
          while(cont < nt){
            System.out.println(ter);
            if(ban ==1){
                ter = ter - 2;
                ban = 2;
            }else{
                ter = ter + 3;
                ban = 1;
            }
            cont = cont + 1;
        }
        return ter;
    }
}
