/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KrasseKollections;

/**
 *
 * @author ADL_LEHMANN26
 */
class Person {
        //muss sein
        
        private final String vorname;
        private final String nachname;
        
        public Person (String v, String n) {
            this.vorname = v; 
            this.nachname = n;
        }
        
        public String getName() {
            return String.format("%s %s", vorname, nachname);
        }
    }
