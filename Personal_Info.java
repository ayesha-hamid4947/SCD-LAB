
public class Personal_Info {
 String F_name;
 String L_name;
 
 public String getF_name(){
	 return F_name;
 }

 public void setF_name(String F_name){
	 this.F_name=F_name;
 }
 public static void main(String args[]){
	 Personal_Info personal_info =new Personal_Info();
	 personal_info.setF_name("Abiha");
	 String F_name=personal_info.getF_name();
	 System.out.println(F_name);
 }
}
