import classfile.Square;
class call_Square
{
      public static void main(String args[])
      {
          Square demo=new Square();
          demo.setTitle("My File");
          demo.setBounds(300,200,600,500);
          demo.setVisible(true);
          demo.setDefaultCloseOperation(demo.EXIT_ON_CLOSE);
          demo.setResizable(false);
        }
}