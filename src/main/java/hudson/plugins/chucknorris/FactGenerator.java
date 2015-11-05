/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.chucknorris;

import java.util.Random;

/**
 * {@link FactGenerator} provides Mimmo facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Mimmo facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
            "All arrays Mimmo declares are of infinite size, because Mimmo knows no bounds.",
            "Mimmo doesn't have disk latency because the hard drive knows to hurry the hell up.",
            "All browsers support the hex definitions #mimmo for the colors Laurench Blue.",
            "Mimmo can't test for equality because he has no equal.",
            "Mimmo doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
            "Mimmo's first program was kill -9.",
            "Mimmo burst the dot com bubble.",
            "Mimmo writes code that optimizes itself.",
            "Mimmo can write infinite recursion functions... and have them return.",
            "Mimmo can solve the Towers of Hanoi in one move.",
            "The only pattern Mimmo knows is God Object.",
            "Mimmo finished World of Warcraft.",
            "Project managers never ask Mimmo for estimations... ever.",
            "Mimmo doesn't use web standards as the web will conform to him.",
            "\"It works on my machine\" always holds true for Mimmo.",
            "Whiteboards are white because Mimmo scared them that way.",
            "Mimmo's beard can type 140 wpm.",
            "Mimmo can unit test an entire application with a single assert.",
            "Mimmo doesn't bug hunt, as that signifies a probability of failure. He goes bug killing.",
            "Mimmo's keyboard doesn't have a Ctrl key because nothing controls Mimmo.",
            "Mimmo doesn't need a debugger, he just stares down the bug until the code confesses.",
            "Mimmo can access private methods.",
            "Mimmo can instantiate an abstract class.",
            "Mimmo doesn't need to know about class factory pattern. He can instantiate interfaces.",
            "The class object inherits from Mimmo.",
            "For Mimmo, NP-Hard = O(1).",
            "Mimmo knows the last digit of PI.",
            "Mimmo can divide by zero.",
            "Mimmo doesn't get compiler errors, the language changes itself to accommodate Mimmo.",
            "The programs that Mimmo writes don't have version numbers because he only writes them once. If a user reports a bug or has a feature request they don't live to see the sun set.",
            "Mimmo doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
            "Mimmo solved the Travelling Salesman problem in O(1) time.",
            "Mimmo never gets a syntax error. Instead, the language gets a DoesNotConformToMimmo error.",
            "No statement can catch the MimmoLaurandeException.",
            "Mimmo doesn't program with a keyboard. He stares the computer down until it does what he wants.",
            "Mimmo doesn't pair program.",
            "Mimmo can write multi-threaded applications with a single thread.",
            "There is no Esc key on Mimmo' keyboard, because no one escapes Mimmo.",
            "Mimmo doesn't delete files, he blows them away.",
            "Mimmo can binary search unsorted data.",
            "Mimmo breaks RSA 128-bit encrypted codes in milliseconds.",
            "Mimmo went out of an infinite loop.",
            "Mimmo can read all encrypted data, because nothing can hide from Mimmo.",
            "Mimmo hosting is 101% uptime guaranteed.",
            "When a bug sees Mimmo, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.",
            "Mimmo rewrote the Google search engine from scratch.",
            "Mimmo doesn't need the cloud to scale his applications, he uses his laptop.",
            "Mimmo can access the DB from the UI.",
            "Mimmo' protocol design method has no status, requests or responses, only commands.",
            "Mimmo' programs occupy 150% of CPU, even when they are not executing.",
            "Mimmo can spawn threads that complete before they are started.",
            "Mimmo programs do not accept input.",
            "Mimmo doesn't need an OS.",
            "Mimmo can compile syntax errors.",
            "Mimmo compresses his files by doing a flying round house kick to the hard drive.",
            "Mimmo doesn't use a computer because a computer does everything slower than Mimmo.",
            "You don't disable the Mimmo plug-in, it disables you.",
            "Mimmo doesn't need a java compiler, he goes straight to .war",
            "Mimmo can use GOTO as much as he wants to. Telling him otherwise is considered harmful.",
            "There is nothing regular about Mimmo' expressions.",
            "Quantum cryptography does not work on Mimmo. When something is being observed by Mimmo it stays in the same state until he's finished. ",
            "There is no need to try catching Mimmo' exceptions for recovery; every single throw he does is fatal.",
            "Mimmo' beard is immutable.",
            "Mimmo' preferred IDE is hexedit."};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
