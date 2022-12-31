class Solution {
    public String addBinary(String a, String b) {
     StringBuilder sb = new StringBuilder();
       //como siempre en las sumas, necesitamos ir contando a partir de los digitos menos significantes (derecha)
        //por eso empezamos el puntero para cada numero desde la derecha
        int i = a.length()-1;
        int j = b.length()-1;
        //carry almacena el valor cuando "nos llevamos una" al sumar
        int carry=0;
        //we want to traverse both completely, not only one
        while(i>=0 || j>=0){
            int sum=carry;
            //para obtener el valor int de los valores ASCII retornados
            if(i>=0) sum += a.charAt(i--)-'0';
            if(j>=0) sum += b.charAt(j--)-'0';
            //estas dos líneas de abajo son dos brillantes ideas para crear el valor de retorno. Dependiendo del valor
            //de la suma, hacemos append de un 1 o un 0
            sb.append(sum % 2);
            //Igual, si sum es 2, nos llevamos 1, si es 0 o 1 no nos llevamos ninguna porque carry seria 0 al redondear
            carry = sum > 1 ? 1 : 0;
          }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}