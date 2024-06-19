in ChatWithMEClient go to Source Packages and then go to com.chat.main package then open Main.java file and be sure to check the initialization of the socket in line 222

/*socket = new Socket("localhost", 5234);*/

the "localhost" means the server and the client work on the same machine so if  you  separate them into two different machines be sure to change it to your network ip