public class Ejercicios {
    public Ejercicios(){

    }
     public int sumaConcecuitivos (int num){//5
        //Caso base
        System.out.println("el num es ="+num);
        if( num == 1)
            return num;
        
        return num + sumaConcecuitivos(num-1);


    }


    public int sumaConcecuitivosPasos (int num){//5
        //Caso base
        System.out.println("el num es ="+num);
        if( num == 1)
            return num;
        // Parte recursiva

        int resultadoRecursivo = sumaConcecuitivosPasos(num-1);
        int resultadoOperacion = num +resultadoRecursivo;
        System.out.println("resultadoOp = " +num + "+" + "sumaConsecuituvaPasos"+ resultadoRecursivo);
        return resultadoOperacion;}

        public int getPotencia( int base, int exponente){
            if ( exponente == 1)
                return base;
            return base * getPotencia(base, exponente -1);


    }

    public int  sumaDigitos( int num){
        if(num < 10)
        return num;
       return(num % 10) + sumaDigitos(num / 10);
    }

    
}