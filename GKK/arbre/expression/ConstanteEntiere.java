package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class ConstanteEntiere extends Constante {
    
    public ConstanteEntiere(String texte) {
        super(texte) ;
    }

	@Override
	public String toMips() {
		this.verify();
		return this.cste;
	}

	public boolean estEntiere(){
		return true;
	}
}
