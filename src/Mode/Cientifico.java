/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mode;

/**
 *
 * @author Estudiante
 */
public class Cientifico {
   private Mode mode;

    public Cientifico() {
      mode=new Write();
    }
    public void doing (){mode.work();}
    public void drink (){mode.drink();}
    public void setWrite(){mode =new Write();}
    public void setTeach(){mode =new Teach();}
    public void setAdm(){mode =new Adm();}
public static void main(String[] args) {
   
  Cientifico einstein=new Cientifico();
   einstein.doing();
   einstein.drink();
   einstein.setTeach();
   einstein.doing();
   einstein.drink();
    }
}
