/* DataQLParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. DataQLParserTokenManager.java */
/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.data.ql.dsl.parser;
/** Token Manager. */
@SuppressWarnings("unused")
public class DataQLParserTokenManager implements DataQLParserConstants {
    /** Debug output. */
    public java.io.PrintStream debugStream = System.out;
    /** Set debug output. */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }
    private final int jjStopStringLiteralDfa_0(int pos, long active0) {
        switch (pos) {
        case 0:
            if ((active0 & 0x20020000L) != 0L)
                return 48;
            if ((active0 & 0x10010000L) != 0L)
                return 49;
            if ((active0 & 0x7c0000L) != 0L) {
                jjmatchedKind = 34;
                return 25;
            }
            return -1;
        case 1:
            if ((active0 & 0x740000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 1;
                return 25;
            }
            if ((active0 & 0x80000L) != 0L)
                return 25;
            return -1;
        case 2:
            if ((active0 & 0x740000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 2;
                return 25;
            }
            return -1;
        case 3:
            if ((active0 & 0x500000L) != 0L)
                return 25;
            if ((active0 & 0x240000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 3;
                return 25;
            }
            return -1;
        case 4:
            if ((active0 & 0x40000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 4;
                return 25;
            }
            if ((active0 & 0x200000L) != 0L)
                return 25;
            return -1;
        case 5:
            if ((active0 & 0x40000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 5;
                return 25;
            }
            return -1;
        case 6:
            if ((active0 & 0x40000L) != 0L) {
                jjmatchedKind = 34;
                jjmatchedPos = 6;
                return 25;
            }
            return -1;
        default:
            return -1;
        }
    }
    private final int jjStartNfa_0(int pos, long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }
    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }
    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
        case 34:
            jjmatchedKind = 17;
            return jjMoveStringLiteralDfa1_0(0x20000000L);
        case 39:
            jjmatchedKind = 16;
            return jjMoveStringLiteralDfa1_0(0x10000000L);
        case 40:
            return jjStopAtPos(0, 7);
        case 41:
            return jjStopAtPos(0, 8);
        case 44:
            return jjStopAtPos(0, 6);
        case 46:
            return jjMoveStringLiteralDfa1_0(0x8000L);
        case 58:
            return jjStopAtPos(0, 13);
        case 91:
            return jjStopAtPos(0, 9);
        case 93:
            return jjStopAtPos(0, 10);
        case 102:
            return jjMoveStringLiteralDfa1_0(0x240000L);
        case 110:
            return jjMoveStringLiteralDfa1_0(0x400000L);
        case 111:
            return jjMoveStringLiteralDfa1_0(0x80000L);
        case 116:
            return jjMoveStringLiteralDfa1_0(0x100000L);
        case 123:
            return jjStopAtPos(0, 11);
        case 125:
            return jjStopAtPos(0, 12);
        default:
            return jjMoveNfa_0(0, 0);
        }
    }
    private int jjMoveStringLiteralDfa1_0(long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
        case 34:
            if ((active0 & 0x20000000L) != 0L)
                return jjStopAtPos(1, 29);
            break;
        case 39:
            if ((active0 & 0x10000000L) != 0L)
                return jjStopAtPos(1, 28);
            break;
        case 46:
            return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
        case 97:
            return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
        case 110:
            if ((active0 & 0x80000L) != 0L)
                return jjStartNfaWithStates_0(1, 19, 25);
            break;
        case 114:
            return jjMoveStringLiteralDfa2_0(active0, 0x140000L);
        case 117:
            return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
        default:
            break;
        }
        return jjStartNfa_0(0, active0);
    }
    private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(0, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
        case 46:
            if ((active0 & 0x8000L) != 0L)
                return jjStopAtPos(2, 15);
            break;
        case 97:
            return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
        case 108:
            return jjMoveStringLiteralDfa3_0(active0, 0x600000L);
        case 117:
            return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
        default:
            break;
        }
        return jjStartNfa_0(1, active0);
    }
    private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(1, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) {
        case 101:
            if ((active0 & 0x100000L) != 0L)
                return jjStartNfaWithStates_0(3, 20, 25);
            break;
        case 103:
            return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
        case 108:
            if ((active0 & 0x400000L) != 0L)
                return jjStartNfaWithStates_0(3, 22, 25);
            break;
        case 115:
            return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
        default:
            break;
        }
        return jjStartNfa_0(2, active0);
    }
    private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(2, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) {
        case 101:
            if ((active0 & 0x200000L) != 0L)
                return jjStartNfaWithStates_0(4, 21, 25);
            break;
        case 109:
            return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
        default:
            break;
        }
        return jjStartNfa_0(3, active0);
    }
    private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(3, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) {
        case 101:
            return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
        default:
            break;
        }
        return jjStartNfa_0(4, active0);
    }
    private int jjMoveStringLiteralDfa6_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(4, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(5, active0);
            return 6;
        }
        switch (curChar) {
        case 110:
            return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
        default:
            break;
        }
        return jjStartNfa_0(5, active0);
    }
    private int jjMoveStringLiteralDfa7_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(5, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(6, active0);
            return 7;
        }
        switch (curChar) {
        case 116:
            if ((active0 & 0x40000L) != 0L)
                return jjStartNfaWithStates_0(7, 18, 25);
            break;
        default:
            break;
        }
        return jjStartNfa_0(6, active0);
    }
    private int jjStartNfaWithStates_0(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }
    static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };
    private int jjMoveNfa_0(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 48;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (; ; ) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                    case 48:
                    case 20:
                        if ((0xfffffffbffffc9ffL & l) != 0L) {
                            jjCheckNAddStates(0, 2);
                        }
                        break;
                    case 0:
                        if ((0x3fe000000000000L & l) != 0L) {
                            if (kind > 26)
                                kind = 26;
                            {
                                jjCheckNAddStates(3, 5);
                            }
                        } else if ((0x7000000000000000L & l) != 0L) {
                            if (kind > 14)
                                kind = 14;
                        } else if ((0x3400L & l) != 0L) {
                            if (kind > 5)
                                kind = 5;
                        } else if ((0x100000200L & l) != 0L) {
                            if (kind > 4)
                                kind = 4;
                        } else if (curChar == 48) {
                            if (kind > 26)
                                kind = 26;
                            {
                                jjCheckNAddStates(6, 8);
                            }
                        } else if (curChar == 45) {
                            jjCheckNAddStates(9, 12);
                        } else if (curChar == 47) {
                            jjAddStates(13, 14);
                        } else if (curChar == 36) {
                            if (kind > 34)
                                kind = 34;
                            {
                                jjCheckNAdd(25);
                            }
                        } else if (curChar == 34) {
                            jjCheckNAddTwoStates(20, 21);
                        } else if (curChar == 39) {
                            jjCheckNAddTwoStates(15, 16);
                        } else if (curChar == 33) {
                            jjCheckNAdd(6);
                        } else if (curChar == 35) {
                            jjCheckNAddTwoStates(1, 2);
                        }
                        if (curChar == 60) {
                            jjCheckNAdd(6);
                        } else if (curChar == 62) {
                            jjCheckNAdd(6);
                        }
                        break;
                    case 49:
                    case 15:
                        if ((0xffffff7fffffc9ffL & l) != 0L) {
                            jjCheckNAddStates(15, 17);
                        }
                        break;
                    case 1:
                        if ((0xffffffffffffcbffL & l) != 0L) {
                            jjCheckNAddTwoStates(1, 2);
                        }
                        break;
                    case 2:
                        if ((0x3400L & l) != 0L && kind > 3)
                            kind = 3;
                        break;
                    case 3:
                        if ((0x100000200L & l) != 0L && kind > 4)
                            kind = 4;
                        break;
                    case 4:
                        if ((0x3400L & l) != 0L && kind > 5)
                            kind = 5;
                        break;
                    case 5:
                        if ((0x7000000000000000L & l) != 0L && kind > 14)
                            kind = 14;
                        break;
                    case 6:
                        if (curChar == 61 && kind > 14)
                            kind = 14;
                        break;
                    case 7:
                        if (curChar == 33) {
                            jjCheckNAdd(6);
                        }
                        break;
                    case 8:
                        if (curChar == 62) {
                            jjCheckNAdd(6);
                        }
                        break;
                    case 9:
                        if (curChar == 60) {
                            jjCheckNAdd(6);
                        }
                        break;
                    case 14:
                        if (curChar == 39) {
                            jjCheckNAddTwoStates(15, 16);
                        }
                        break;
                    case 17:
                        if ((0x808000000000L & l) != 0L) {
                            jjCheckNAddStates(15, 17);
                        }
                        break;
                    case 18:
                        if (curChar == 39 && kind > 32)
                            kind = 32;
                        break;
                    case 19:
                        if (curChar == 34) {
                            jjCheckNAddTwoStates(20, 21);
                        }
                        break;
                    case 22:
                        if ((0x800400000000L & l) != 0L) {
                            jjCheckNAddStates(0, 2);
                        }
                        break;
                    case 23:
                        if (curChar == 34 && kind > 33)
                            kind = 33;
                        break;
                    case 24:
                        if (curChar != 36)
                            break;
                        if (kind > 34)
                            kind = 34;
                    {
                        jjCheckNAdd(25);
                    }
                    break;
                    case 25:
                        if ((0x3ff600000000000L & l) == 0L)
                            break;
                        if (kind > 34)
                            kind = 34;
                    {
                        jjCheckNAdd(25);
                    }
                    break;
                    case 26:
                        if (curChar == 47) {
                            jjAddStates(13, 14);
                        }
                        break;
                    case 27:
                        if (curChar == 47) {
                            jjCheckNAddTwoStates(28, 29);
                        }
                        break;
                    case 28:
                        if ((0xffffffffffffcbffL & l) != 0L) {
                            jjCheckNAddTwoStates(28, 29);
                        }
                        break;
                    case 29:
                        if ((0x3400L & l) != 0L && kind > 1)
                            kind = 1;
                        break;
                    case 30:
                        if (curChar == 42) {
                            jjCheckNAddTwoStates(31, 33);
                        }
                        break;
                    case 31: {
                        jjCheckNAddTwoStates(31, 33);
                    }
                    break;
                    case 32:
                        if (curChar == 47 && kind > 2)
                            kind = 2;
                        break;
                    case 33:
                        if (curChar == 42)
                            jjstateSet[jjnewStateCnt++] = 32;
                        break;
                    case 34:
                        if (curChar == 45) {
                            jjCheckNAddStates(9, 12);
                        }
                        break;
                    case 35:
                        if (curChar != 48)
                            break;
                        if (kind > 26)
                            kind = 26;
                    {
                        jjCheckNAdd(35);
                    }
                    break;
                    case 36:
                        if ((0x3fe000000000000L & l) == 0L)
                            break;
                        if (kind > 26)
                            kind = 26;
                    {
                        jjCheckNAdd(37);
                    }
                    break;
                    case 37:
                        if ((0x3ff000000000000L & l) == 0L)
                            break;
                        if (kind > 26)
                            kind = 26;
                    {
                        jjCheckNAdd(37);
                    }
                    break;
                    case 38:
                        if (curChar == 48) {
                            jjCheckNAddTwoStates(38, 39);
                        }
                        break;
                    case 39:
                        if (curChar == 46) {
                            jjCheckNAdd(40);
                        }
                        break;
                    case 40:
                        if ((0x3ff000000000000L & l) == 0L)
                            break;
                        if (kind > 27)
                            kind = 27;
                    {
                        jjCheckNAddTwoStates(40, 41);
                    }
                    break;
                    case 42:
                        if ((0x280000000000L & l) != 0L) {
                            jjCheckNAdd(43);
                        }
                        break;
                    case 43:
                        if ((0x3ff000000000000L & l) == 0L)
                            break;
                        if (kind > 27)
                            kind = 27;
                    {
                        jjCheckNAdd(43);
                    }
                    break;
                    case 44:
                        if ((0x3fe000000000000L & l) != 0L) {
                            jjCheckNAddTwoStates(45, 39);
                        }
                        break;
                    case 45:
                        if ((0x3ff000000000000L & l) != 0L) {
                            jjCheckNAddTwoStates(45, 39);
                        }
                        break;
                    case 46:
                        if (curChar != 48)
                            break;
                        if (kind > 26)
                            kind = 26;
                    {
                        jjCheckNAddStates(6, 8);
                    }
                    break;
                    case 47:
                        if ((0x3fe000000000000L & l) == 0L)
                            break;
                        if (kind > 26)
                            kind = 26;
                    {
                        jjCheckNAddStates(3, 5);
                    }
                    break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 48:
                        if ((0xffffffffefffffffL & l) != 0L) {
                            jjCheckNAddStates(0, 2);
                        } else if (curChar == 92)
                            jjstateSet[jjnewStateCnt++] = 22;
                        break;
                    case 0:
                        if ((0x47fffffe87fffffeL & l) != 0L) {
                            if (kind > 34)
                                kind = 34;
                            {
                                jjCheckNAdd(25);
                            }
                        }
                        if (curChar == 108)
                            jjstateSet[jjnewStateCnt++] = 12;
                        break;
                    case 49:
                        if ((0xffffffffefffffffL & l) != 0L) {
                            jjCheckNAddStates(15, 17);
                        } else if (curChar == 92)
                            jjstateSet[jjnewStateCnt++] = 17;
                        break;
                    case 1: {
                        jjAddStates(18, 19);
                    }
                    break;
                    case 10:
                        if (curChar == 101 && kind > 14)
                            kind = 14;
                        break;
                    case 11:
                        if (curChar == 107)
                            jjstateSet[jjnewStateCnt++] = 10;
                        break;
                    case 12:
                        if (curChar == 105)
                            jjstateSet[jjnewStateCnt++] = 11;
                        break;
                    case 13:
                        if (curChar == 108)
                            jjstateSet[jjnewStateCnt++] = 12;
                        break;
                    case 15:
                        if ((0xffffffffefffffffL & l) != 0L) {
                            jjCheckNAddStates(15, 17);
                        }
                        break;
                    case 16:
                        if (curChar == 92)
                            jjstateSet[jjnewStateCnt++] = 17;
                        break;
                    case 17:
                        if ((0x14404410000000L & l) != 0L) {
                            jjCheckNAddStates(15, 17);
                        }
                        break;
                    case 20:
                        if ((0xffffffffefffffffL & l) != 0L) {
                            jjCheckNAddStates(0, 2);
                        }
                        break;
                    case 21:
                        if (curChar == 92)
                            jjstateSet[jjnewStateCnt++] = 22;
                        break;
                    case 22:
                        if ((0x14404410000000L & l) != 0L) {
                            jjCheckNAddStates(0, 2);
                        }
                        break;
                    case 24:
                        if ((0x47fffffe87fffffeL & l) == 0L)
                            break;
                        if (kind > 34)
                            kind = 34;
                    {
                        jjCheckNAdd(25);
                    }
                    break;
                    case 25:
                        if ((0x7fffffe87fffffeL & l) == 0L)
                            break;
                        if (kind > 34)
                            kind = 34;
                    {
                        jjCheckNAdd(25);
                    }
                    break;
                    case 28: {
                        jjAddStates(20, 21);
                    }
                    break;
                    case 31: {
                        jjAddStates(22, 23);
                    }
                    break;
                    case 41:
                        if ((0x2000000020L & l) != 0L) {
                            jjAddStates(24, 25);
                        }
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                    case 48:
                    case 20:
                        if ((jjbitVec0[i2] & l2) != 0L) {
                            jjCheckNAddStates(0, 2);
                        }
                        break;
                    case 49:
                    case 15:
                        if ((jjbitVec0[i2] & l2) != 0L) {
                            jjCheckNAddStates(15, 17);
                        }
                        break;
                    case 1:
                        if ((jjbitVec0[i2] & l2) != 0L) {
                            jjAddStates(18, 19);
                        }
                        break;
                    case 28:
                        if ((jjbitVec0[i2] & l2) != 0L) {
                            jjAddStates(20, 21);
                        }
                        break;
                    case 31:
                        if ((jjbitVec0[i2] & l2) != 0L) {
                            jjAddStates(22, 23);
                        }
                        break;
                    default:
                        break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }
    static final        int[]    jjnextStates       = { 20, 21, 23, 37, 45, 39, 35, 38, 39, 35, 36, 38, 44, 27, 30, 15, 16, 18, 1, 2, 28, 29, 31, 33, 42, 43, };
    /** Token literal values. */
    public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, "\54", "\50", "\51", "\133", "\135", "\173", "\175", "\72", null, "\56\56\56", "\47", "\42", "\146\162\141\147\155\145\156\164", "\157\156", "\164\162\165\145", "\146\141\154\163\145", "\156\165\154\154", null, null, null, null, null, "\47\47", "\42\42", null, null, null, null, null, };
    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);
        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;
        return t;
    }
    int curLexState     = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;
    /** Get the next Token. */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;
        EOFLoop:
        for (; ; ) {
            try {
                curChar = input_stream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                jjmatchedPos = -1;
                matchedToken = jjFillToken();
                return matchedToken;
            }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos)
                    input_stream.backup(curPos - jjmatchedPos - 1);
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    return matchedToken;
                } else {
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else
                    error_column++;
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }
    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }
    private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }
    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }
    private void jjCheckNAddStates(int start, int end) {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }
    /** Constructor. */
    public DataQLParserTokenManager(SimpleCharStream stream) {
        if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        input_stream = stream;
    }
    /** Constructor. */
    public DataQLParserTokenManager(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }
    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }
    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 48; i-- > 0; )
            jjrounds[i] = 0x80000000;
    }
    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }
    /** Switch to specified lex state. */
    public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }
    /** Lexer state names. */
    public static final String[] lexStateNames = { "DEFAULT", };
    static final        long[]   jjtoToken     = { 0x73c7fffc1L, };
    static final        long[]   jjtoSkip      = { 0x3eL, };
    protected SimpleCharStream input_stream;
    private final int[] jjrounds   = new int[48];
    private final int[] jjstateSet = new int[2 * 48];
    protected char curChar;
}
