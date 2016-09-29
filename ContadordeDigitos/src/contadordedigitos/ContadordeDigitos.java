package contadordedigitos;




public class ContadordeDigitos {


    public static void main(String[] args) {
        int num = 10;
        
    if ( num >=0 && num<100000 ){
        
        if (num >0 && num <= 9){ System.out.println("Hay 1 digito");}
        
        if (num >=10 && num <= 99){ System.out.println("Hay 2 digito");}
        
        if (num >=100 && num <999){ System.out.println("Hay 3 digitos");}
        
        if (num >=10000 && num<9999){System.out.println("Hay 4 digitos");}
        
        if (num >=10000 && num<99999){System.out.println("Hay 5 digitos");}
    
    }
        
    else { System.out.println("Ingrese un Valor valido entre 1 y 10000");
                
    }
    }
          
      
        
    }
    

