 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B F r e q u e n c y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . u t i l s . H B N u t r a l P r i n t W r i t e r ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B J o i n T e s t e r   {  
  
 	 L i s t < H B J o i n T e s t D a t a >   l i s t T e s t D a t a   =   n e w   A r r a y L i s t < H B J o i n T e s t D a t a > ( ) ;  
 	  
 	 p u b l i c   H B J o i n T e s t e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p r i v a t e   v o i d   L o a d T e s t D a t a ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t )  
 	 { 	 	  
 / * 	 	 H B J o i n T e s t D a t a   o T e s t D a t a 1   =   n e w   H B J o i n T e s t D a t a ( "������ " ,   "� " ,   "������ " ) ;  
 	 	 H B J o i n T e s t D a t a   o T e s t D a t a 2   =   n e w   H B J o i n T e s t D a t a ( "��� " ,   "��� " ,   "����� " ) ;  
 	 	 l i s t T e s t D a t a . a d d ( o T e s t D a t a 1 ) ;  
 	 	 l i s t T e s t D a t a . a d d ( o T e s t D a t a 2 ) ;  
 * / 	 	                  
                 i n t   i C o u n t   =   0 ;  
  
                 t r y     {  
  
                 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ,   s C h a r S e t ) ) ;  
                         S t r i n g   s L i n e ;  
                         w h i l e   ( ( s L i n e   =   b r . r e a d L i n e ( ) )   ! =   n u l l )   {                         	  
                         	 i f ( A d d J o i n T e s t D a t a ( s L i n e ,   i C o u n t ) )  
                         	 {  
                         	 	 i C o u n t + + ;  
                         	 }  
                         }  
                         b r . c l o s e ( ) ;  
  
                 }   c a t c h   ( I O E x c e p t i o n   e )   {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : L o a d T e s t D a t a   :   E r r o r   a t   r e c o r d   "   +   ( i C o u n t   - 1 )   ) ;  
                         e . p r i n t S t a c k T r a c e ( ) ;                          
                 } 	 	  
                  
                 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : L o a d T e s t D a t a   :   "   +   ( l i s t T e s t D a t a . s i z e ( ) )   +   "   T e s t   D a t a   R e c o r d s   L o a d e d . " ) ; 	  
 	 }  
 	  
 	  
 	  
 	 p u b l i c   b o o l e a n   A d d J o i n T e s t D a t a ( S t r i n g   s L i n e ,   i n t   i L i n e N u m )  
 	 {  
 	 	 S t r i n g   c v s S p l i t B y   =   " , " ;  
                 S t r i n g [ ]   i t e m s   =   s L i n e . s p l i t ( c v s S p l i t B y ) ;  
                  
                 i f ( i t e m s . l e n g t h < 3 )  
                 {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : A d d J o i n T e s t D a t a   :   E r r o r   a t   r e c o r d   "   +   ( i L i n e N u m )   +   "   :   d e l i m e t e r   c o u n t   =   "   +   i t e m s . l e n g t h   +   "   :   [ 0 ] = "   +   i t e m s [ 0 ] ) ;  
                 	 r e t u r n   f a l s e ;  
                 }  
                 e l s e  
                 {                 	  
                 	 S t r i n g   s L e f t   =   H e l a b a s a . C l e a n ( i t e m s [ 0 ] ) ;  
                 	 S t r i n g   s R i g h t   =   H e l a b a s a . C l e a n ( i t e m s [ 1 ] ) ;  
                 	 S t r i n g   s J o i n e d   =   H e l a b a s a . C l e a n ( i t e m s [ 2 ] ) ;  
                 	  
                 	 / / p r i n t C h a r s ( s L e f t ) ;  
                 	 / / p r i n t C h a r s ( s R i g h t ) ;  
                 	 / / p r i n t C h a r s ( s J o i n e d ) ;                
                 	  
                 	 H B J o i n T e s t D a t a   o T e s t D a t a   =   n e w   H B J o i n T e s t D a t a ( s L e f t ,   s R i g h t ,   s J o i n e d ) ;  
                 	 l i s t T e s t D a t a . a d d ( o T e s t D a t a ) ;  
                 	 r e t u r n   t r u e ;  
                 }         	 	  
 	 } 	  
 	  
 	 p r i v a t e   v o i d   p r i n t C h a r s ( S t r i n g   s V a l )  
 	 { 	  
 	 	 i n t   i C o u n t   =   s V a l . l e n g t h ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " [ "   +   s V a l . c h a r A t ( i )   +   "   -   "   +   ( i n t ) ( s V a l . c h a r A t ( i ) )   +     " ] < b r > " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " [ "   +   s V a l . c h a r A t ( i )   +   "   -   "   +   ( i n t ) ( s V a l . c h a r A t ( i ) )   +   " ] " ) ;  
 	 	 	 }  
 	 	 }  
 	 }  
 	  
         p r i v a t e   v o i d   J o i n ( i n t   i M e t h o d ,   S t r i n g   s L e f t ,   S t r i n g   s R i g h t ,   H B J o i n R e s u l t s S e t   o R e s u l t s ,   H B J o i n S c o r i n g A l g o r i t h m   o S c o r i n g A l g o )  
         {     	         	  
         	 H B W o r d J o i n e r . J o i n ( s L e f t ,   s R i g h t ,   i M e t h o d ,   o R e s u l t s ,   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ) ;         	  
         	 / / o S c o r i n g A l g o . E v a l u a t e ( o R e s u l t s ) ;         	         	  
         }    
 	  
         p r i v a t e   H B J o i n T e s t S u m m a r y   T e s t A l g o r i t h m ( H B J o i n S c o r i n g A l g o r i t h m   o A l g o )  
         {  
         	 H B J o i n T e s t S u m m a r y   o S u m m a r y   =   n e w   H B J o i n T e s t S u m m a r y ( o A l g o . G e t N a m e ( ) ) ;  
         	 R u n T e s t ( o A l g o ) ;         	  
         	 R u n A n a l y s i s ( o S u m m a r y ) ;  
         	 C l e a r T e s t D a t a ( ) ;  
         	 r e t u r n   o S u m m a r y ;  
         }  
                  
 	 p r i v a t e   b o o l e a n   R u n T e s t ( H B J o i n S c o r i n g A l g o r i t h m   o A l g o )  
 	 { 	 	 	  
 	 	 i n t   i C o u n t   =   l i s t T e s t D a t a . s i z e ( ) ;  
 	 	 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n T e s t D a t a   o T e s t D a t a   =     l i s t T e s t D a t a . g e t ( i ) ;  
 	 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s   =   n e w   H B J o i n R e s u l t s S e t ( ) ;  
 	 	 	  
         	 	 f o r ( i n t   j = H B W o r d J o i n R u l e . P O O R W A _ S W A R A _ L O P A ;   j < H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D   +   1 ;   j + + )  
 	 	 	 {         	 	 	  
         	 	 	 J o i n ( j ,   o T e s t D a t a . s _ L e f t ,   o T e s t D a t a . s _ R i g h t ,   o R e s u l t s ,   o A l g o ) ;  
         	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " J o i n i n g   u s i n g   "   +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ j ]   +   "   :   C o u n t = "   +   o R e s u l t s . G e t R e s u l t s C o u n t ( ) ) ;  
 	 	 	 } 	 	 	  
         	 	  
         	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E v a l u a t i n g   u s i n g   "   +   o A l g o . G e t N a m e ( )   +   "   a l g o r i t h m "   ) ;  
         	 	 o A l g o . E v a l u a t e ( o R e s u l t s ) ;  
         	 	 o T e s t D a t a . S e t R e s u l t s S e t ( o R e s u l t s ) ;  
         	 	 H B J o i n R e s u l t s   o R e s u l t   =   o R e s u l t s . G e t B e s t R e s u l t s ( ) ;  
         	 	 o T e s t D a t a . S e t R e s u l t ( o R e s u l t ) ;   	 	  
 	 	 } 	 	  
 	 	  
 	 	 i n t   i P a s s C o u n t   =   0 ;  
 	 	 i n t   i F a i l e d C o u n t   =   0 ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n T e s t D a t a   o T e s t D a t a   =     l i s t T e s t D a t a . g e t ( i ) ;         	 	  
         	 	 i f ( o T e s t D a t a . V a l i d a t e ( ) )  
         	 	 {  
         	 	 	 i P a s s C o u n t + + ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 i F a i l e d C o u n t + + ;  
         	 	 }  
 	 	 }  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : R u n T e s t   ( " +   o A l g o . G e t N a m e ( )   + " )   :   P a s s e d = "   +   i P a s s C o u n t   +   "   :   F a i l e d = "   +   i F a i l e d C o u n t ) ;  
 	 	  
 	 	 i f ( i F a i l e d C o u n t = = 0 )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : R u n T e s t   ( " +   o A l g o . G e t N a m e ( )   + " )   :   P A S S " ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : R u n T e s t   ( " +   o A l g o . G e t N a m e ( )   + " )   :   F A I L " ) ;  
 	 	 	 r e t u r n   f a l s e ; 	 	 	  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   C l e a r T e s t D a t a ( )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t T e s t D a t a . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n T e s t D a t a   o T e s t D a t a   =     l i s t T e s t D a t a . g e t ( i ) ; 	 	 	  
         	 	 o T e s t D a t a . R e s e t ( ) ; 	 	  
 	 	 } 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   R u n A n a l y s i s ( H B J o i n T e s t S u m m a r y   o S u m m a r y )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = =   B E G I N   A N A L Y S I S   = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " K e y   :   [ A l g o   P a s s / F a i l   |   R e s u l t   C o r r e c t / I n c o r r e c t ] " ) ; 	 	 	 	  
 	 	 i n t   i C o u n t   =   l i s t T e s t D a t a . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	 	 	  
 	 	 	 H B J o i n T e s t D a t a   o T e s t D a t a   =     l i s t T e s t D a t a . g e t ( i ) ;  
 	 	 	 o T e s t D a t a . A n a l y s e ( o S u m m a r y ) ; 	 	 	  
 	 	 }  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = =   E N D   A N A L Y S I S   = = = = = = = = = = = = = = = = = = = " ) ;  
 	 }  
 	  
 	 p u b l i c   c l a s s   H B J o i n T e s t S u m m a r y  
 	 {  
 	 	 p u b l i c   i n t   a i _ C o r r e c t [ ]   =   n e w   i n t [ H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D + 1 ] ;  
 	 	 p u b l i c   i n t   a i _ I n C o r r e c t [ ]   =   n e w   i n t [ H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D + 1 ] ;  
 	 	 p u b l i c   i n t   a i _ A l g o C o r r e c t [ ]   =   n e w   i n t [ H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D + 1 ] ;  
 	 	 p u b l i c   i n t   a i _ A l g o I n C o r r e c t [ ]   =   n e w   i n t [ H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D + 1 ] ;  
 	 	  
 	 	 p u b l i c   i n t   i _ T o t a l C o r r e c t   =   0 ;  
 	 	 p u b l i c   i n t   i _ T o t a l I n C o r r e c t   =   0 ;  
 	 	 p u b l i c   S t r i n g   s _ A l g o N a m e   =   " " ;  
 	 	  
 	 	 p u b l i c   H B J o i n T e s t S u m m a r y ( S t r i n g   s A l g o N a m e )  
 	 	 {  
 	 	 	 s _ A l g o N a m e   =   s A l g o N a m e ;  
 	 	 }  
 	 	  
 	 	 v o i d   A d d A l g o R e s u l t ( i n t   i M e t h o d ,   b o o l e a n   b A l g o C o r r e c t )  
 	 	 { 	 	 	  
 	 	 	 i f ( b A l g o C o r r e c t )  
 	 	 	 {  
 	 	 	 	 a i _ A l g o C o r r e c t [ i M e t h o d ]   =   a i _ A l g o C o r r e c t [ i M e t h o d ]   +   1 ;  
 	 	 	 	 i _ T o t a l C o r r e c t + + ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 a i _ A l g o I n C o r r e c t [ i M e t h o d ]   =   a i _ A l g o I n C o r r e c t [ i M e t h o d ]   +   1 ;  
 	 	 	 	 i _ T o t a l I n C o r r e c t + + ;  
 	 	 	 } 	 	 	  
 	 	 	  
 	 	 }  
 	 	  
 	 	 v o i d   A d d J o i n M e t h o d S t a t ( i n t   i M e t h o d ,   b o o l e a n   b R e s u l t s C o r r e c t )  
 	 	 {  
 	 	 	 i f ( b R e s u l t s C o r r e c t )  
 	 	 	 {  
 	 	 	 	 a i _ C o r r e c t [ i M e t h o d ]   =   a i _ C o r r e c t [ i M e t h o d ]   +   1 ;  
  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 a i _ I n C o r r e c t [ i M e t h o d ]   =   a i _ I n C o r r e c t [ i M e t h o d ]   +   1 ; 	 	 	 	 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 v o i d   P r i n t S u m m a r y ( )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = =   S U M M A R Y   = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " [ "   +   s _ A l g o N a m e   +   " ]   :   P A S S = "   +     i _ T o t a l C o r r e c t   +   "   :   F A I L = "   +   i _ T o t a l I n C o r r e c t ) ;  
 	 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D + 1 ;   i + + )  
 	 	 	 {  
 	 	 	 	 i f ( i > 9 )  
 	 	 	 	 {  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " M e t h o d   [ "   +   i   +   " ]   :   M A T C H = "   +     a i _ C o r r e c t [ i ]   +   "   :   M I S M A T C H = "   +   a i _ I n C o r r e c t [ i ]   +   "   :   A L G O _ P A S S = "   +     a i _ A l g o C o r r e c t [ i ]   +   "   :   A L G O _ F A I L = "   +   a i _ A l g o I n C o r r e c t [ i ]   +   "   ( "   +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i ]   +   " ) " ) ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " M e t h o d   [   "   +   i   +   " ]   :   M A T C H = "   +     a i _ C o r r e c t [ i ]   +   "   :   M I S M A T C H = "   +   a i _ I n C o r r e c t [ i ]   +   "   :   A L G O _ P A S S = "   +     a i _ A l g o C o r r e c t [ i ]   +   "   :   A L G O _ F A I L = "   +   a i _ A l g o I n C o r r e c t [ i ]   +   "   ( "   +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i ]   +   " ) " ) ;  
 	 	 	 	 }  
 	 	 	 } 	 	 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = =   E N D   S U M M A R Y   = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   c l a s s   H B J o i n T e s t D a t a  
 	 {  
 	 	 p u b l i c   S t r i n g   s _ L e f t   =   " " ;  
 	 	 p u b l i c   S t r i n g   s _ R i g h t   =   " " ;  
 	 	 p u b l i c   S t r i n g   s _ E x p e c t e d R e s u l t   =   " " ;  
 	 	  
 	 	 p u b l i c   H B J o i n R e s u l t s   o _ R e s u l t s   =   n u l l ;  
 	 	 p u b l i c   H B J o i n R e s u l t s S e t   o _ R e s u l t s S e t   =   n u l l ;  
 	 	  
 	 	  
 	 	 p u b l i c   H B J o i n T e s t D a t a ( S t r i n g   s L e f t ,   S t r i n g   s R i g h t ,   S t r i n g   s E x p e c t e d R e s u l t )  
 	 	 {  
 	 	 	 s _ L e f t   =   s L e f t ;  
 	 	 	 s _ R i g h t   =   s R i g h t ;  
 	 	 	 s _ E x p e c t e d R e s u l t   =   s E x p e c t e d R e s u l t ;  
 	 	 }  
 	 	  
 	 	 p u b l i c   v o i d   R e s e t ( )  
 	 	 {  
 	 	 	 o _ R e s u l t s   =   n u l l ;  
 	 	 	 o _ R e s u l t s S e t   =   n u l l ;  
 	 	 }  
  
 	 	 p u b l i c   v o i d   S e t R e s u l t ( H B J o i n R e s u l t s   o R e s u l t )  
 	 	 {  
 	 	 	 o _ R e s u l t s   =   o R e s u l t ;  
 	 	 }  
 	 	  
 	 	  
 	 	 p u b l i c   v o i d   S e t R e s u l t s S e t ( H B J o i n R e s u l t s S e t   o R e s u l t s S e t )  
 	 	 {  
 	 	 	 o _ R e s u l t s S e t   =   o R e s u l t s S e t ;  
 	 	 } 	 	  
 	 	  
 	 	 p u b l i c   b o o l e a n   V a l i d a t e ( )  
 	 	 {  
 	 	 	 i f ( o _ R e s u l t s = = n u l l   | |   o _ R e s u l t s . G e t R e s u l t ( ) = = n u l l )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : H B J o i n T e s t D a t a : V a l i d a t e   :   N o   R e s u l t   :   "   +   s _ E x p e c t e d R e s u l t   +   "   =   N U L L " ) ;  
 	 	 	 	 r e t u r n   f a l s e ; 	 	 	 	  
 	 	 	 }  
 	 	 	 e l s e   i f ( s _ E x p e c t e d R e s u l t . e q u a l s ( o _ R e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : H B J o i n T e s t D a t a : V a l i d a t e   :   M a t c h   :   "   +   s _ E x p e c t e d R e s u l t   +   "   =   "   +   o _ R e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B J o i n T e s t e r : : H B J o i n T e s t D a t a : V a l i d a t e   :   M i s m a t c h   :   "   +   s _ E x p e c t e d R e s u l t   +   "   ! =   "   +   o _ R e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	  
 	 	 p u b l i c   v o i d   A n a l y s e ( H B J o i n T e s t S u m m a r y   o S u m m a r y )  
 	 	 {  
 	 	 	 i n t   i C o u n t   =   o _ R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) ;  
 	 	 	 b o o l e a n   b A l g o C o r r e c t   =   f a l s e ;  
 	 	 	 b o o l e a n   b R e s u l t C o r r e c t   =   f a l s e ;  
 	 	 	 S t r i n g   s P a s s F a i l   =   " [ P ] " ;  
 	 	  
 	 	 	 i f ( s _ E x p e c t e d R e s u l t . e q u a l s ( o _ R e s u l t s . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 b A l g o C o r r e c t   =   t r u e ; 	 	 	 	  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 b A l g o C o r r e c t   =   f a l s e ; 	 	 	 	  
 	 	 	 }  
 	 	 	  
 	 	 	 o S u m m a r y . A d d A l g o R e s u l t ( o _ R e s u l t s . G e t J o i n M e t h o d ( ) ,   b A l g o C o r r e c t ) ;  
 	 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 H B J o i n R e s u l t s   o R e s u l t   =   o _ R e s u l t s S e t . G e t R e s u l t s A t ( i ) ;  
 	 	 	 	 i f ( s _ E x p e c t e d R e s u l t . e q u a l s ( o R e s u l t . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 b R e s u l t C o r r e c t   =   t r u e ;  
 	 	 	 	 	 i f ( b A l g o C o r r e c t )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 s P a s s F a i l   =   " [ P C ] " ;  
 	 	 	 	 	 }  
 	 	 	 	 	 e l s e  
 	 	 	 	 	 {  
 	 	 	 	 	 	 s P a s s F a i l   =   " [ F C ] " ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 b R e s u l t C o r r e c t   =   f a l s e ;  
 	 	 	 	 	  
 	 	 	 	 	 i f ( b A l g o C o r r e c t )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 s P a s s F a i l   =   " [ P I ] " ;  
 	 	 	 	 	 }  
 	 	 	 	 	 e l s e  
 	 	 	 	 	 {  
 	 	 	 	 	 	 s P a s s F a i l   =   " [ F I ] " ;  
 	 	 	 	 	 } 	 	 	 	 	  
 	 	 	 	 } 	 	 	 	  
 	 	 	 	  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( s P a s s F a i l   +   "   :   [ "   +   s _ L e f t   +   " ]   +   [ "   +   s _ R i g h t   +   " ]   =   [ "   +    
 	 	 	 	 	 	 o R e s u l t . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   +   " ]   :   M e t h o d = "   +   o R e s u l t . G e t J o i n M e t h o d ( )   +   "   :   F r e q = "   +   o R e s u l t . G e t R e s u l t ( ) . G e t F r e q u e n c y ( )   +    
 	 	 	 	 	 	 "   :   A l g o = "   +   o S u m m a r y . s _ A l g o N a m e ) ;  
 	 	 	 	  
 	 	 	 	 o S u m m a r y . A d d J o i n M e t h o d S t a t ( o R e s u l t . G e t J o i n M e t h o d ( ) ,   b R e s u l t C o r r e c t ) ; 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	  
  
 	 }  
  
         p u b l i c   v o i d   T e s t ( )  
         { 	  
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o A l g o 1   =   n e w   H B F r e q u e n c y B a s e d S c o r i n g A l g o r i t h m ( 2 ) ;  
 	 	 H B J o i n T e s t S u m m a r y   o S u m m a r y 1   =   T e s t A l g o r i t h m ( o A l g o 1 ) ;  
 	 	 / / C l e a r T e s t D a t a ( ) ;  
  
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o A l g o 2   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
 	 	 H B J o i n T e s t S u m m a r y   o S u m m a r y 2   =   T e s t A l g o r i t h m ( o A l g o 2 ) ;  
 	 	 / / C l e a r T e s t D a t a ( ) ;  
 	 	  
 	 	 o S u m m a r y 1 . P r i n t S u m m a r y ( ) ;      
 	 	 o S u m m a r y 2 . P r i n t S u m m a r y ( ) ;  
         }  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   B e g i n   T e s t   :   H B J o i n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 	 	  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 / / H e l a b a s a . S e t D e b u g L o g ( n e w   N u t r a l P r i n t W r i t e r ( ) ) ;  
 	 	 H e l a b a s a . S e t D e b u g L o g ( H e l a b a s a . G e t L o g ( ) ) ;  
 	 	  
 	 	 H B J o i n T e s t e r   o T e s t e r   =   n e w   H B J o i n T e s t e r ( ) ;  
 	 	 i f ( a r g s . l e n g t h = = 1 )  
 	 	 {  
 	 	 	 H e l a b a s a . S e t D e b u g L o g ( n e w   H B N u t r a l P r i n t W r i t e r ( ) ) ;  
 	 	 }  
 	 	 e l s e   i f ( a r g s . l e n g t h = = 2 )  
 	 	 {  
 	 	 	 H e l a b a s a . S e t D e b u g L o g ( H e l a b a s a . G e t L o g ( ) ) ; 	  
 	 	 }  
 	 	 e l s e    
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " E R R O R   :   U s a g e   H B J o i n T e s t e r   [ f i l e   n a m e ]   < v e r b o s e s > " ) ;  
 	 	 }  
 	 	  
 	 	 o T e s t e r . L o a d T e s t D a t a ( a r g s [ 0 ] ,   " U T F - 8 " ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   E n d   T e s t   :   H B J o i n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 	  
 	 	 o T e s t e r . T e s t ( ) ;  
 	 }  
  
 }  
