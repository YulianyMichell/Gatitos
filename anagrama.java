import java.util.Scanner;
public class anagrama {
    
    public static void main(String[] args) {
        Scanner scanner=new.Scanner();
        System.out.println("Ingrese la primera palabra");

        char [] palabra1={'A','M','O','R'};
        char [] palabra2={'R','O','M','A'};

        int contador=0;
        int longPalabra1=palabra1.length;
        int longPalabra2=palabra2.length;
        
        for(int i=0;i<longPalabra1;i++){
            for(int j=0;j<longPalabra2;i++){
                if (palabra1[i]==palabra2[j]){
                    contador++;
                    palabra2[j]=' ';
                    break;
                }
            }
        }
        if(contador == longPalabra1){
            System.out.println("Son anagramas");
        }else{
            System.out.println("No son anagramas");
        }
    }
}