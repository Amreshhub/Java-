import java.awt.*;
import java.awt.event.*;


 	
 class Stdntrecord extends  Frame //implements ItemListener,ActionListener
 {
 int i,j,k;
 		Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
 		TextField t1,t2,t3,tj,tl;
 		CheckboxGroup cbg1=new CheckboxGroup();
 		Checkbox cb1,cb2,cb3,cb4;
 		Button b1,b2;
 		Choice comb1,comb2;
 		char  item[]=new char[6];
 		public void design()
 		{
 			
 			l1=new Label("NAME");
 			l2=new Label("ROLL");
 			l3=new Label("FEE");
 			l4=new Label("QUALIFICATION");
 			l5=new Label("GENDER");
 			l6=new Label("CITY");
 			l7=new Label("HOBBY");
 			l8=new Label("NAME");
 			l9=new Label("ROLL");
 			l10=new Label("FEE");
 			l11=new Label("QUALIFICATION");
 			l12=new Label("GENDER");
 			l13=new Label("HOBBY");
 			l14=new Label("-");
 		//	l15=new Label("-");
 			Checkbox rb1=new Checkbox("MALE",cbg1,false);
 			Checkbox rb2=new Checkbox("FEMALE",cbg1,false);
 	    	cb1=new Checkbox("READING");
 			cb2=new Checkbox("PLAYING");
 			cb3=new Checkbox("EATING");
 			cb4=new Checkbox("SINGING");
 			b1=new Button("ACCEPT");
 			b2=new Button("PRINT");
 		    t1=new TextField();
 		    t2=new TextField();
 		    t3=new TextField();
 		    
 		    comb1=new Choice();
 		    comb2=new Choice();
 			setLayout(null);
 			setBounds(20,10,800,800);
 			show();
 			l14.setBounds(10,500,10,1000);
 			//l15.setBounds(10,530,1000,1000);
 			l1.setBounds(30,50,100,40);
 			t1.setBounds(150,50,100,40);
 			l2.setBounds(300,50,100,40);
 			t2.setBounds(450,50,100,40);
 			l3.setBounds(30,100,100,40);
 			t3.setBounds(150,100,100,40);
 			l4.setBounds(300,100,100,40);
 			comb1.setBounds(450,110,100,40);
 			l5.setBounds(30,150,100,40);
 			rb1.setBounds(150,150,90,50);
 			rb2.setBounds(250,150,90,50);
 			l6.setBounds(450,200,50,40);
 			comb2.setBounds(500,210,100,40);
 			l7.setBounds(30,250,100,40);
 			cb1.setBounds(150,250,100,40);
 			cb2.setBounds(300,250,100,40);
 			cb3.setBounds(450,250,100,40);
 			cb4.setBounds(300,300,100,40);
 			b1.setBounds(40,400,100,40);
 			b2.setBounds(350,400,100,40);
 			l8.setBounds(40,460,100,40);
 			l9.setBounds(170,460,100,40);
 			l10.setBounds(280,460,70,40);
 			l11.setBounds(350,460,110,40);
 			l12.setBounds(480,460,100,40);
 			l13.setBounds(600,460,100,40);
 			for(k=520;k<=770;k++)
 			{
 			
 			for(i=20;i<=620;)
 			  {	
 				for(j=4;j<=13;j++)
 					{
 	                	tj=new TextField();
 	                    tj.setBounds(i,k,100,40);
 	                       add(tj);
 					}i=i+110;
    	      }
 			  k=k+50;
 			}
 				
 			
 		
 	
 				
 			comb1.add("BCA");
 			comb1.add("MCA");
 			comb1.add("B.TECH");
 			comb1.add("M.TECH");
 			comb1.add("B.SC");
 			comb1.add("M.SC");
 			comb2.add("PATNA");
 			comb2.add("RANCHI");
 			comb2.add("BHAGLPUR");
 			comb2.add("HAJIPUR");
 		
 	     	add(l1);
 			add(l2);
 			add(l3);
 			add(l4);
 			add(l5);
 			add(l6);
 			add(l7);
 			add(l8);
 	
 			
 					add(l9);
 					add(l10);
 					add(l11);
 					add(l12);
 					add(l13);
 					add(l14);
 				   // add(l15);
 					add(cb1);
 					add(cb2);
 					add(cb3);
 					add(cb4);
 					add(t1);
 					add(t2);
 					add(t3);
 				
 				
 			
 					add(b1);
 					add(b2);
 					add(comb1);
 					add(comb2);
 					add(rb1);
 					add(rb2);
 	
 	
 	
 		}
 		
 		
 		
 		
 /*	class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}	
 		
}	
 		public void actionPerformed(ActionEvent ae)
 		{
 			if(ae.getSource()==b1)
 			{
 		
 		
 			    }
 			
 	if(ae.getSource()==b2)
 	{
 	
 	
 	}
 
    }*/
    
		
 		
 	
 }
 	
 	
 			
 			
 			
 			
 		

    class StdntrecordMain
    	 {
    	 	public static void main (String[] args)
    	 		 
    	 		 {
    	 		 	Stdntrecord s1=new Stdntrecord();
    	 		 	s1.design();
    	 		 	
}
    }
    
    
