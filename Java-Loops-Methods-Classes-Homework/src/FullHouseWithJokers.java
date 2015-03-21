
public class FullHouseWithJokers {
	public static void main(String[] args) {
		
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		int countFullHouses = 0;
		String firstCard = "";
		String secondCard = "";
		String thirdCard = "";
		String fourthCard = "";
		String fifthCard = "";
		
		for(int face = 0; face < faces.length; face++) {
			for(int nextFace = 0; nextFace < faces.length; nextFace++) {
				if(face != nextFace) {
					for(int suit1 = 0; suit1 < suits.length; suit1++){
						for(int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
							for(int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
								for(int suit4 = 0; suit4 < suits.length; suit4++) {
									for(int suit5 = suit4 + 1; suit5 < suits.length; suit5++) {
										firstCard = faces[face] + suits[suit1];
										secondCard = faces[face] + suits[suit2];
										thirdCard = faces[face] + suits[suit3];
										fourthCard = faces[nextFace] + suits[suit4];
										fifthCard = faces[nextFace] + suits[suit5];
										String[] hand = { firstCard, secondCard, thirdCard, fourthCard, fifthCard };
												
										for(int combos = 0; combos <= 31; combos++) {
											int check = combos;
											for(int joker = 0; joker < 5; joker++) {
												if(check % 2 == 1) {
													hand[joker] = "*";
													check /= 2;
												}
											}
											System.out.println("(" + hand[0] + hand[1] + hand[2] + hand[3] + hand[4] +")");		
											countFullHouses++;
			
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.print("\n" + countFullHouses + " full houses");
	}
}
