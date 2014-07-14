/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.validate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Wilson
 */
@FacesValidator("cpfValidator")
public class CPFValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        boolean valido = o instanceof Long && ((Long) o) > 0 && ((Long) o) < 100000000000L;
        if (!valido) {
            throw new ValidatorException(new FacesMessage("CPF deve estar entre 00000000001 e 99999999999"));
        }
    }
    
}
