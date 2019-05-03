class Solution {
    public boolean isNumber(String s) {

        String regex1 = "(\\s*)[-+]?(\\d+)(\\.)?(\\d*)(\\s*)";
        String regex2 = "(\\s*)[-+]?(\\d+)(\\.)?(\\d*)[e](\\d+)(\\s*)";
        String regex3 = "(\\s*)[-+]?(\\d+)(\\.)?(\\d*)[e][-+](\\d+)(\\s*)";
        String regex4 = "(\\s*)[-+]?(\\d*)(\\.)?(\\d+)(\\s*)";
        String regex5 = "(\\s*)[-+]?(\\d*)(\\.)?(\\d+)[e](\\d+)(\\s*)";
        String regex6 = "(\\s*)[-+]?(\\d*)(\\.)?(\\d+)[e][-+](\\d+)(\\s*)";

        if((s.matches(regex1) || (s.matches(regex2)) || (s.matches(regex3)) || (s.matches(regex4)) || (s.matches(regex5)) || (s.matches(regex6)) ) ){
            return true;
        }
        else{
            return false;
        }

    }
}
