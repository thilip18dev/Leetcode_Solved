class Solution {
    public boolean isNumber(String s) {
    String regex ="^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))(e[+-]?\\d+)?$";
    return s.trim().toLowerCase().matches(regex);
    }
}