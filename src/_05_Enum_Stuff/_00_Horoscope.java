package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.

	void getHoroscope(Zodiac zTypes) {
		System.out.println("All of the horoscope information is for February 23, 2020");
		switch(zTypes) {
			case ARIES:
				JOptionPane.showMessageDialog(null, "It’s possible that you could fear for your job today, Aries. Fortunately, those fears are unfounded. There is a lot of upheaval occurring at work. You’re best advised to steer clear of it, if you can. \nIf you continue to do your job well, you’re likely to receive a bonus or promotion as a result of your efforts. You've earned it.");
				break;
			case TAURUS:
				JOptionPane.showMessageDialog(null, "It's hard to deny the power of a chemical reaction to another person. You’ll likely meet someone today or perhaps you've just met someone who has a strong influence on you, Taurus. You can’t get this \nperson out of your mind. It isn’t clear whether this is a one-time fling or a long-term romance. Whatever it turns out to be, you’re thrilled to be feeling so excited and alive.");
				break;
			case GEMINI:
				JOptionPane.showMessageDialog(null, "The person who dies with the most toys wins” may well be your philosophy, Gemini. And today you certainly move ahead in the race as you add yet another technological wonder to your home. What is it this \ntime? A scanner, digital camera, DVD player, or all of the above? It's a small indulgence for all the hard work you do. If these things really give you such pleasure, then you deserve to have them.");
				break;
			case CANCER:
				JOptionPane.showMessageDialog(null, "Today you could sit down at the computer for just a minute to research something on the Internet and wind up spending most of the afternoon entranced by what you're reading, Cancer. You could very well \nstumble upon some information on the occult and mysticism. It’s always fascinated you, and now that you've begun learning, you don't want to stop. Perhaps you could enroll in a workshop and mingle with others who share a similar interest.");
				break;
			case LEO:
				JOptionPane.showMessageDialog(null, "You’ve always had a knack for all things financial, Leo, but today your ability is especially enhanced. You’ve discovered all the free investing information available over the Internet, and you absorb \nit like a sponge. Your natural fiscal sense enables you to separate the nonsense from the sound investment advice. Your portfolio and your mood benefit immediately!");
				break;
			case VIRGO:
				JOptionPane.showMessageDialog(null, "Keep your eyes wide open today, Virgo, as you may meet the person of your dreams! Or you could stumble, literally, upon a stack of cash. It’s likely to be a most unusual day, so keep your wits about you \nand your mind open to all possibilities. If an intriguing new business opportunity comes your way, don't accept it right immediately. Take down all the information and review it when life has settled down somewhat.");
				break;
			case LIBRA:
				JOptionPane.showMessageDialog(null, "A change of profession may be in the stars for you, Libra, or a change of hobby at the very least. The latest technological advances have really captured your interest. Making films, in particular, gets \nyour creative juices flowing. Perhaps it's time to sign up for a weekend workshop or splurge on that video camera you've been eyeing. The diversion will do you a world of good.");
				break;
			case SCORPIO:
				JOptionPane.showMessageDialog(null, "You’re likely to be feeling the tug of distant lands, Scorpio. Today you could stop at the travel agent’s office, the one you've walked by countless times, and stare at the pictures. Thailand, Hong Kong, \nand New Zealand are just a few of the places you'd like to see. The pictures look so enticing. Go ahead. Plan such a trip, although it’s likely to be only a temporary diversion. Your wanderlust indicates a fundamental restlessness that must be resolved.");
				break;
			case SAGITTARIUS:
				JOptionPane.showMessageDialog(null, "Change, even when it's for the better, can sometimes be a little scary, Sagittarius. You could feel some hesitation about taking a new job or upgrading your home. Nevertheless, you’re being given a \nterrific opportunity. If you don't seize it, you’ll likely regret it for the rest of your life. What's occurring is for the best, so stretch your arms up high and reach for that brass ring!");
				break;
			case CAPRICORN:
				JOptionPane.showMessageDialog(null, "There are plenty of opportunities out there, and you’re tempted to seize every one of them. Well, Capricorn, a bit of discrimination is in order if you’re going to make the best use of the auspicious atmosphere. \nTravel is definitely in the picture, as is continuing your education in some way. It could be something simple, such as enrolling in a cooking class at an adult education center. Or perhaps you're going to fulfill a lifelong ambition and apply to business school. Good for you!");
				break;
			case AQUARIUS:
				JOptionPane.showMessageDialog(null, "You’re likely to receive a windfall of some sort today. Be cautious with it, Aquarius. If you invest it wisely, it will serve you long and well. Your curiosity has been piqued about some rather esoteric \nsubjects, perhaps the dark arts. Why not visit your local library to check out some books on these topics of interest?");
				break;
			case PISCES:
				JOptionPane.showMessageDialog(null, "A change of scene is in store for you, Pisces. It’s unclear whether or not this is a voluntary move, but it’s clear that chaos and confusion reign over the next few days. There is much to be done. Fortunately, \nyour organizational abilities will serve you well. You don your general's hat, wield your clipboard like a sword, and get everybody doing your bidding. The move is completed in record time!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Something went wrong.");
				break;
				
	}
	}
	Zodiac userZodiac(String i) {
		switch(i.toLowerCase()) {
		case "aries":
			return Zodiac.ARIES;
		case "taurus":
			return Zodiac.TAURUS;
		case "gemini":
			return Zodiac.GEMINI;
		case "cancer":
			 return Zodiac.CANCER;
		case "leo":
			return Zodiac.LEO;
		case "virgo":
			return Zodiac.VIRGO;
		case "libra":
			return Zodiac.LIBRA;
		case "scorpio":
			return Zodiac.SCORPIO;
		case "sagittarius":
			return Zodiac.SAGITTARIUS;
		case "capricorn":
			return Zodiac.CAPRICORN;
		case "aquarius":
			return Zodiac.AQUARIUS;
		case "pisces":
			return Zodiac.PISCES;
		default:
			return Zodiac.DEFUALT;
	}
	}
	
	// 3. Make a main method to test your method
public static void main(String[] args) {
	_00_Horoscope Horoscope=new _00_Horoscope();
	String i=JOptionPane.showInputDialog(null, "What is your Zodiac sign?");
	Horoscope.getHoroscope(Horoscope.userZodiac(i));
}
}

