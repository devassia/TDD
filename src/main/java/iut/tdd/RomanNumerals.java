package iut.tdd;

public class RomanNumerals {

	public String convertToRoman(String arabe) {
		int nb=Integer.parseInt(arabe);
		String res="";

		if (nb<3999 && nb>0) {
			int tmp=nb/1000;
			if (tmp>0) {
				res=aideconv(tmp)+"M";
				nb=nb-tmp*1000;
			}
			int tmp=nb/500
			else if () {
				
			} else {

			}
		}
		return "res";
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

	public String aideconv(int romain){
		String res ="";

		switch (romain) {
		case 1:  romain=1 ;
		res="I";
		break;
		case 2: romain=2 ;
		res="II";
		break;
		case 3:  romain=3 ;
		res="II";
		break;
		case 4:  romain=4 ;
		res="IV";
		break;
		case 5: romain=5 ;
		res="V";
		break;
		case 6:  romain=6 ;
		res="VI";
		break;
		case 7:  romain=7 ;
		res="VII";
		break;
		case 8:  romain=8;
		res="IIX";
		break;
		case 9:  romain=9 ;
		res="IX";
		break;
		default: res= "Invalid number";
		break;
		}
		return res;
	}
}
