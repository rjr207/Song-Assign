package application;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;

public class SongLib extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	//main method currently contains no java fx elements. Only temporary sysin/sysout testing
	//code, which I have marked
	public static void main(String[] args) {
		//launch(args);
				
		Scanner text;//TESTING
		String input;//TESTING
		String tiIn;//TESTING
		String arIn;//TESTING
		String alIn;//TESTING
		String yeIn;//TESTING
		String tioIn;//TESTING
		String aroIn;//TESTING
		String aloIn;//TESTING
		String yeoIn;//TESTING
		
		SongList list = new SongList();
		list.loadSongs();
		
		//temporary input directly from console for TESTING
		text = new Scanner(System.in);
		
		while(true){
			System.out.println("input add, delete, edit, print or quit");
			input = text.nextLine();

			if(input.equalsIgnoreCase("quit")){
				text.close();
				return;
				
			}else if(input.equalsIgnoreCase("add")){
				
				System.out.println("Enter: title, artist, album, year");
				tiIn = text.nextLine();
				arIn = text.nextLine();
				alIn = text.nextLine();
				yeIn = text.nextLine();
				
				list.addSong(tiIn, arIn, alIn, yeIn);
			}else if(input.equalsIgnoreCase("edit")){
				
				System.out.println("Enter: title, artist, album, year for old, then for new");
				tioIn = text.nextLine();
				aroIn = text.nextLine();
				aloIn = text.nextLine();
				yeoIn = text.nextLine();
				tiIn = text.nextLine();
				arIn = text.nextLine();
				alIn = text.nextLine();
				yeIn = text.nextLine();
				
				list.editSong(tioIn, aroIn, aloIn, yeoIn, tiIn, arIn, alIn, yeIn);
				
			}else if(input.equalsIgnoreCase("delete")){
				
				System.out.println("Enter: title, artist");
				tiIn = text.nextLine();
				arIn = text.nextLine();
				
				list.deleteSong(tiIn, arIn);
			}else if(input.equalsIgnoreCase("print")){
			
				list.printList();
				
			}else{
				System.out.println("Invalid entry...");
			}
			
		}
		//END TESTING CODE
		
		
		
	}
}
