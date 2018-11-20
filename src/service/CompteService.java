/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;

/**
 *
 * @author lenovo
 */
public class CompteService extends AbstractFacade<Compte>{
    
    public CompteService() {
        super(Compte.class);
    }
    public void initBd(){
        for (int i = 0; i <=10; i++) {
            ouvrir("cc" +i, i * 100);
            
        }
}
    
    public Compte ouvrir(String rib,double soldeInitial){
        Compte compte=new Compte(rib, soldeInitial);
        compte.setOuvert(true);
        if(soldeInitial>0 && soldeInitial<100){
            compte.setSolde("D");
        }
        else if(soldeInitial>=100 && soldeInitial<1000){
            compte.setSolde("C");
        }
        else{
            compte.setSolde("B");
        }
       create(compte);
       return compte;
    }
   public int crediter(String rib,double montant){
       Compte compte=find(rib);
      if(compte==null){
          return -1;
      }
      else if(compte.isOuvert()==false){
          return -2;
      }
      else if(compte.getSolde()<montant){
          return -3;
      }
      else{
          compte.setSolde(compte.getSolde()-montant);
          edit(compte);
          return 1;
      }
   }
public int transferer(String ribSource,String ribDestination,double montant){
    Compte compteSource=find(ribSource);
    Compte compteDestination=find(ribDestination);
    if(compteSource==null){
        return -1;
    }else if (compteDestination==null){
        return -2;
        }
    else if (compteSource.isOuvert()==false){
        return -3;
    }
    else if(compteDestination.isOuvert()==false){
        return -4;
    }else if(compteSource.getSolde()<montant){
        return -5;
    }else{
        compteSource.setSolde(compteSource.getSolde()-montant);
        compteDestination.setSolde(compteDestination.getSolde()+montant);
        edit(compteSource);
        edit(compteDestination);
        return 1;
    }
    
    
}
    
}
