package com.ludius;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();

        AAA aaa = new AAA("ssss");
        System.out.println(aaa);
        final AAA sss = aaa;
        System.out.println(sss);
        AAA ss1 = aaa;
        System.out.println(ss1);
        aaa = app.ttt(aaa);
        System.out.println(aaa);
        System.out.println(ss1.getId());
        System.out.println(sss.getId());
        System.out.println(aaa.getId());

    }


    public AAA ttt(AAA aaa){
        System.out.println(">>>>>>>>>>>>>"+aaa);
        aaa = null;
        return aaa;
    }





}

 class AAA{
    private String id;
    public AAA(String id){
        this.id = id;
    }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }
 }
