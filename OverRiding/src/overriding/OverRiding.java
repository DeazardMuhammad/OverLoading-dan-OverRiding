package overriding;
class Manusia{
    public void Berpakaian(){
        System.out.println("Semua Manusia Berpakaian");
    }
    
    public void BertahanHidup(){
        System.out.println("Semua manusia pasti makan");
    }
}

class Pria extends Manusia{
    
    @Override
    public void Berpakaian(){
        System.out.println("Pria pakai kemeja dan jeans");
    }
}
class Wanita extends Manusia {
    @Override
    public void Berpakaian(){
        System.out.println("Wanita pakai Kerudung, kemeja wanita, dan rok panjang");
    }
}
        
    
public class OverRiding {

    public static void main(String[] args) {
        Pria Deazard = new Pria();
        Wanita Dinda = new Wanita();
        
        Deazard.Berpakaian();
        Deazard.BertahanHidup();
        
        Dinda.Berpakaian();
        Dinda.BertahanHidup();
        
    }
}
        