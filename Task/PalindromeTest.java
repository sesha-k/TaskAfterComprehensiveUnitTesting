import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {


    @Test
    void nextPalindromeOfOneIsTwo() throws Exception {
        var palindrome =new Palindrome();
        assertEquals(2,palindrome.nextPalindrome(1));
    }
    @Test
    void noNextPalindromeOfMinusTwo() throws Exception {
        var palindrome =new Palindrome();
        Exception exception = assertThrows(Exception.class, () -> palindrome.nextPalindrome(-2));
        assertEquals("Negative numbers are not palindromic", exception.getMessage());
    }
    /*@Test
    void noNextPalindromeOfSachin() throws Exception {
        var palindrome =new Palindrome();
        Exception exception = assertThrows(Exception.class, () -> palindrome.nextPalindrome("sachin"));
        assertEquals("Invalid input. Please only give numbers.", exception.getMessage());
    }*/
    @Test
    void nextPalindromeOfTwentyTwoIsThirtyThree() throws Exception {
        var palindrome =new Palindrome();

        assertEquals(33,palindrome.nextPalindrome(22));
    }
    @Test
    void nextPalindromeOfFiveTwentyTwoIsFiveTwentyFive() throws Exception {
        var palindrome =new Palindrome();

        assertEquals(525,palindrome.nextPalindrome(522));
        assertNotEquals(535,palindrome.nextPalindrome(522));
    }
    @Test
    void nextPalindromeOfOneFiveFiveIsOneSixOne() throws Exception {
        var palindrome =new Palindrome();

        assertEquals(161,palindrome.nextPalindrome(155));
        assertNotEquals(155,palindrome.nextPalindrome(155));
    }
    @Test
    void nextPalindromeOfOneTwoThreeFourIsOneThreeThreeOne() throws Exception {
        var palindrome =new Palindrome();
        assertEquals(1331,palindrome.nextPalindrome(1234));
    }
    @Test
    void nextPalindromeOfFourThreeTwoOneIsFourThreeThreeFour() throws Exception {
        var palindrome =new Palindrome();
        assertEquals(4334,palindrome.nextPalindrome(4321));
    }





}