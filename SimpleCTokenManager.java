/* SimpleCTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. SimpleCTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class SimpleCTokenManager implements SimpleCConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fff80000000L) != 0L)
         {
            jjmatchedKind = 46;
            return 41;
         }
         if ((active0 & 0x20000000L) != 0L)
            return 32;
         if ((active0 & 0x240000L) != 0L)
         {
            jjmatchedKind = 53;
            return -1;
         }
         if ((active0 & 0x4000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0x309000000000L) != 0L)
            return 41;
         if ((active0 & 0xf6f80000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 1;
            }
            return 41;
         }
         if ((active0 & 0x240000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 53;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x10000000000L) != 0L)
            return 41;
         if ((active0 & 0x3e6f80000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 2;
            return 41;
         }
         return -1;
      case 3:
         if ((active0 & 0x2e00000000L) != 0L)
            return 41;
         if ((active0 & 0x3e4180000000L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 3;
            }
            return 41;
         }
         return -1;
      case 4:
         if ((active0 & 0x3a0000000000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 4;
            }
            return 41;
         }
         if ((active0 & 0x44000000000L) != 0L)
            return 41;
         return -1;
      case 5:
         if ((active0 & 0x380000000000L) != 0L)
            return 41;
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return 41;
         }
         return -1;
      case 6:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 6;
            return 41;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 3);
      case 13:
         return jjStopAtPos(0, 4);
      case 32:
         return jjStopAtPos(0, 1);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 37:
         return jjStopAtPos(0, 30);
      case 38:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 40:
         return jjStopAtPos(0, 8);
      case 41:
         return jjStopAtPos(0, 9);
      case 42:
         return jjStopAtPos(0, 28);
      case 43:
         return jjStopAtPos(0, 26);
      case 44:
         return jjStartNfaWithStates_0(0, 14, 1);
      case 45:
         return jjStopAtPos(0, 27);
      case 47:
         return jjStartNfaWithStates_0(0, 29, 32);
      case 59:
         return jjStopAtPos(0, 15);
      case 60:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 61:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 62:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 91:
         return jjStopAtPos(0, 12);
      case 93:
         return jjStopAtPos(0, 13);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20180000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x308000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x600000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 123:
         return jjStopAtPos(0, 10);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 125:
         return jjStopAtPos(0, 11);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 61:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 25);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 41);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4180000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 111:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x330e00000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 124:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4800000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20600000000L);
      case 114:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 41);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x300000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x300000000000L);
      case 100:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 41);
         break;
      case 101:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 41);
         break;
      case 103:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x180000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(4, 33);
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 41);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 107:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 41);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(5, 31);
         break;
      case 101:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      case 110:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 43, 41);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(6, 44);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 41, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 48;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(36, 39); }
                  else if (curChar == 47)
                     { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 0:
                  if ((0xffffff7b00000000L & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  if ((0xfc00ff7b00000000L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     { jjCheckNAddStates(4, 10); }
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                  }
                  else if (curChar == 47)
                     { jjAddStates(11, 12); }
                  else if (curChar == 46)
                     { jjCheckNAdd(17); }
                  else if (curChar == 44)
                     jjstateSet[jjnewStateCnt++] = 1;
                  if ((0xff000000000000L & l) != 0L)
                  {
                     if (kind > 54)
                        kind = 54;
                  }
                  break;
               case 1:
                  if ((0xffffff7b00000000L & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 3:
                  if (curChar == 34)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 4:
                  if ((0xffffff7b00000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 5:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
               case 11:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0xff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 8:
                  if (curChar == 34 && kind > 50)
                     kind = 50;
                  break;
               case 10:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 15:
                  if (curChar == 48)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 16:
                  if (curChar == 46)
                     { jjCheckNAdd(17); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddTwoStates(17, 18); }
                  break;
               case 19:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(20); }
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAdd(20); }
                  break;
               case 21:
                  if ((0xffffff7b00000000L & l) != 0L && kind > 53)
                     kind = 53;
                  break;
               case 22:
                  if ((0xff000000000000L & l) != 0L && kind > 54)
                     kind = 54;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L && kind > 55)
                     kind = 55;
                  break;
               case 24:
                  if ((0xfc00ff7b00000000L & l) != 0L && kind > 56)
                     kind = 56;
                  break;
               case 26:
                  if (curChar == 48 && kind > 49)
                     kind = 49;
                  break;
               case 27:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if (curChar == 44 && kind > 49)
                     kind = 49;
                  break;
               case 31:
                  if (curChar == 47)
                     { jjAddStates(11, 12); }
                  break;
               case 33:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 34:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 35:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(36, 39); }
                  break;
               case 36:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(36, 39); }
                  break;
               case 38:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 39:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  { jjCheckNAddStates(4, 10); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(43); }
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 45); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAddStates(13, 16); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffffefffffffL & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  else if (curChar == 92)
                     { jjAddStates(17, 18); }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     { jjCheckNAdd(41); }
                  }
                  else if ((0x78000001e8000001L & l) != 0L)
                  {
                     if (kind > 56)
                        kind = 56;
                  }
                  if ((0x7e0000007eL & l) != 0L)
                  {
                     if (kind > 55)
                        kind = 55;
                  }
                  break;
               case 1:
                  if ((0x7fffffffefffffffL & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 4:
                  if ((0x7fffffffffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 9:
                  if (curChar == 92)
                     { jjAddStates(19, 21); }
                  break;
               case 12:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x7e0000007eL & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 15:
                  if ((0x14400000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(22, 23); }
                  break;
               case 21:
                  if ((0x7fffffffefffffffL & l) != 0L && kind > 53)
                     kind = 53;
                  break;
               case 23:
                  if ((0x7e0000007eL & l) != 0L && kind > 55)
                     kind = 55;
                  break;
               case 24:
                  if ((0x78000001e8000001L & l) != 0L && kind > 56)
                     kind = 56;
                  break;
               case 25:
                  if (curChar == 92)
                     { jjAddStates(17, 18); }
                  break;
               case 33:
                  { jjAddStates(24, 25); }
                  break;
               case 36:
                  jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  { jjAddStates(26, 27); }
                  break;
               case 40:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAdd(41); }
                  break;
               case 41:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAdd(41); }
                  break;
               case 45:
                  if (curChar == 95)
                     { jjCheckNAdd(46); }
                  break;
               case 46:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(46); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 33:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(24, 25); }
                  break;
               case 36:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 37:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(26, 27); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   4, 5, 8, 9, 43, 44, 45, 16, 17, 18, 47, 32, 35, 16, 17, 18, 
   47, 26, 27, 10, 12, 15, 19, 20, 33, 34, 36, 39, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\50", "\51", "\173", "\175", 
"\133", "\135", "\54", "\73", "\75", "\46", "\174\174", "\46\46", "\75\75", "\41\75", 
"\74", "\76", "\74\75", "\76\75", "\53", "\55", "\52", "\57", "\45", 
"\143\150\141\162\52\52", "\143\150\141\162\52", "\154\157\156\147\52", "\154\157\156\147", 
"\166\157\151\144", "\151\146", "\145\154\163\145", "\167\150\151\154\145", "\144\157", 
"\146\157\162", "\143\157\156\164\151\156\165\145", "\142\162\145\141\153", 
"\162\145\164\165\162\156", "\144\157\165\142\154\145\52", "\144\157\165\142\154\145", null, null, null, 
null, null, null, null, null, null, null, null, };
static protected Token jjFillToken()
{
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

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 12 && (0x1200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public SimpleCTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public SimpleCTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 48; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffffffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[48];
    static private final int[] jjstateSet = new int[2 * 48];

    
    static protected char curChar;
}
