import java.awt.CardLayout;

public class FullHouse {
	public static void main(String[] args) {
		
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		int countFullHouses = 0;
		
		for(int face = 0; face < faces.length; face++) {
			String firstFace = faces[face];
			
			for(int suit1 = 0; suit1 < suits.length; suit1++){
				for(int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
					for(int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
						
						for(int nextFace = 0; nextFace < faces.length; nextFace++) {
							String secondFace = faces[nextFace];
							
							if(firstFace != secondFace) {
								for(int otherSuit = 0; otherSuit < suits.length; otherSuit++) {
									for(int anotherSuit = otherSuit + 1; anotherSuit < suits.length; anotherSuit++) {
										countFullHouses++;
										System.out.print("(" + firstFace + suits[suit1] + firstFace + suits[suit2] + firstFace + suits[suit3] + secondFace + "" + suits[otherSuit] + "" + secondFace + "" + suits[anotherSuit] + ") ");
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("\n" + countFullHouses + " full houses");
	}
}
