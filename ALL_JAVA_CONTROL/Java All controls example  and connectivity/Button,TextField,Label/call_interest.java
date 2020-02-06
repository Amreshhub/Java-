import classfile.Interest;
class call_interest
{
      public static void main(String args[])
      {
          Interest demo=new Interest();
          demo.setTitle("My File");
          demo.setBounds(300,200,600,500);
          demo.setVisible(true);
          demo.setDefaultCloseOperation(demo.EXIT_ON_CLOSE);
          demo.setResizable(false);
        }
}