import {AbstractControl, ValidatorFn} from '@angular/forms'

export function amtvalidator(control : AbstractControl)  {

    if(control.value ===0){

        return {default: true};
    }

    return null;
}


export function ageRangeValidator(min: number): ValidatorFn {
    return (control: AbstractControl): { [key: string]: boolean } | null => {
    
     if(control.value ===0){

        return {default: true};
    }
    
        if (control.value !== undefined && (isNaN(control.value) || control.value > min )) {
            return { 'ageRange': true };
        }
        
        
       
        return null;
    };
}
