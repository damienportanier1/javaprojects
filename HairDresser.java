
/*
 *Hairdresser.java
 *@author L Murphy
 *9/12/2016
 */

 public class HairDresser{
	 private String service;
	 private String day;
	 private String length;

	 public HairDresser(){
		 service = " ";
		 day = " ";
		 length= "";
	 }

	 public void setService(String service){
		 this.service = service;
	 }

	 public void setLength(String length){
		 this.length = length;
	 }

	 public void compute(){
		 if(service.equalsIgnoreCase("cut")){
			 if(length.equalsIgnoreCase("short")){
				 day = "Monday";
			 }
			 else{
				 day = "Tuesday";
			 }
		 }
		 else if(service.equalsIgnoreCase("colour")){
			 if(length.equalsIgnoreCase("short")){
				 day = "Wednesday";
			 }
			 else{
				 day = "Thursday";
			 }
		 }
		 else if(service.equalsIgnoreCase("blowDry")){
			 if(length.equalsIgnoreCase("short")){
				 day = "Friday";
			 }
			 else{
				 day = "Saturday";
			 }
		 }

	 }

	 public String getDay(){
		 return day;
	 }
 }


