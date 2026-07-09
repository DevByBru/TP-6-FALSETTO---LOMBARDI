
package tp6.falsetto.lombardi;
public class contador {

    private int cont;
    
    public contador(){
        
    }
  public contador(int cont) {
      this.cont = cont;
      if (cont < 0){
          this.cont = 0;
      } 
      else {
          this.cont= cont;
      }
              }   
  public contador(contador copia) {
      this.cont = copia.cont;
  }
    public int getcont(){
        return this.cont;
    }  
public void setcont(int nuevocont) {
    this.cont = nuevocont;
}    
public void incrementar() {
    this.cont = this.cont + 1;
       }
public void decrementar() {
    this.cont = this.cont - 1;
    
    if (this.cont < 0) {
        this.cont = 0;        
    }
}

   public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int numeroinicial;
        System.out.println("Escriba el numero desde que arranca el contador: ");
         numeroinicial = sc.nextInt();
        contador contador1 = new contador(numeroinicial); 
        System.out.println("El contador arranco en: " + contador1.getcont());
        
        System.out.println("elegir 1 para incrementar contador, elegir 2 para decrementar contador");
        int opcion = sc.nextInt();
        
        if (opcion == 1) {
             contador1.incrementar();
             }
        if (opcion == 2)
         contador1.decrementar(); 
        
        System.out.println("El valor actual del contador es: " + contador1.getcont());
    
   }
    
}
