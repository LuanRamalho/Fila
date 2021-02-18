public class FormaFila 
{
    int a[] = new int[5];
    int i;
    public void enfileirar()
    {
        a[0] = 6;
        a[1] = 5;
        a[2] = -12;
        a[3] = 4;
        a[4] =-3;
        
        for(i=0; i<=0; i++)
        {
            System.out.println("Enfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=0; i<=1; i++)
        {
            System.out.println("Enfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=0; i<=2; i++)
        {
            System.out.println("Enfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=0; i<=3; i++)
        {
            System.out.println("Enfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=0; i<=4; i++)
        {
            System.out.println("Enfileirando: "+a[i]);
        }
    }
    
    
    public void desenfileirando()
    {
        for(i=0; i<=4; i++)
        {
            System.out.println("Desenfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=1; i<=4; i++)
        {
            System.out.println("Desenfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=2; i<=4; i++)
        {
            System.out.println("Desenfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=3; i<=4; i++)
        {
            System.out.println("Desenfileirando: "+a[i]);
        }
        
        System.out.println();
        
        for(i=4; i<=4; i++)
        {
            System.out.println("Desenfileirando: "+a[i]);
        }
    }
}
