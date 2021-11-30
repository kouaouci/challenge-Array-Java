class TableauChallenge{
    public static void main(String[]   args){
        String[] films ={
            "Indiana Jones et le Royaume du crane du cristal","Indiana Jones et la derniere croisade","Indianna jones et le temple maudit"
        };
        String[][] acteur= {  {"Steven speilberg","harisson ford","Cat Blanchett"},
        {"steven speilberg","Harisson ford","saen corinnery"},
     {"steven speilberg ","harisson ford","Kate capshaw"}
      };
        
       
        for( int i =0;i< films.length; i++){
            System.out.println(films[i]);
           for (int j =0;j<acteur.length; j++){
            System.out.println(acteur[i][j]);
           }

         
        };
    }
}