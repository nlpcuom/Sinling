 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n A n a l y z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . H B J o i n T e s t e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   N o u n A n a l y z e r   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
         	 S t r i n g   s N o u n   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " t N o u n " ) ) ;  
         	         	         	  
         	 i f ( s N o u n = = n u l l )  
         	 {  
         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   0 ,   " " ) ;  
         	 }      
         	 e l s e   i f ( s N o u n . t r i m ( ) . l e n g t h ( ) = = 0   )  
         	 {  
         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   1 ,   " " ) ;  
         	 }  
         	 e l s e  
         	 { 	         	 	  
         	 	 p r i n t P a g e ( o R e q ,   o R e s ,   2 ,   s N o u n . t r i m ( ) ) ;  
         	 } 	  
         }  
 	  
 	  
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s ,   i n t   i T y p e ,   S t r i n g   s N o u n )   t h r o w s   I O E x c e p t i o n  
         {         	  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
         	  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                 H e l a b a s a . I n i t ( ) ;  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                              
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   N o u n   A n a l y z e r < / t i t l e > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > \ n < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                  
                 o u t . p r i n t l n ( " < s c r i p t > " ) ;                  
                 o u t . p r i n t l n ( " f u n c t i o n   s e t W o r k i n g P a n e l ( ) { " ) ;  
                 o u t . p r i n t l n ( " v a r   o W o r k i n g s   =   d o c u m e n t . g e t E l e m e n t B y I d ( \ " w o r k i n g s \ " ) ; " ) ;                  
                 o u t . p r i n t l n ( " v a r   o W o r k i n g P a n e l   =   d o c u m e n t . g e t E l e m e n t B y I d ( \ " w o r k i n g _ p a n e l \ " ) ; " ) ;  
                 o u t . p r i n t l n ( " i f ( o W o r k i n g P a n e l ! = n u l l )   {   o W o r k i n g P a n e l . a p p e n d C h i l d ( o W o r k i n g s ) ;   }   } \ n " ) ;                
                 o u t . p r i n t l n ( " w i n d o w . o n l o a d   =   s e t W o r k i n g P a n e l ; " ) ;                                  
                 o u t . p r i n t l n ( " < / s c r i p t > " ) ;  
                                  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / i n d e x . h t m l ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > N o u n   A n a l y z e r   (���  ��    ���������� )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f n c o n j '   a c t i o n = ' . / n o u n _ a n a l y z e r '   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 4 > N o u n   F o r m   (���  ��� )   < i n p u t   t y p e = ' t e x t '   n a m e = ' t N o u n '   v a l u e = ' "   +   s N o u n   +   " '   s t y l e = ' f o n t - s i z e :   1 4 ' > " ) ;  
                  
                 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
                  
                 / / o u t . p r i n t l n ( "   C l a s s   (��� )   :   " +   G e t R u l e S e t E n t r y ( o R u l e s ,   i R u l e S e t ) ) ;  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b A n a l y z e '   v a l u e = ' A n a l y z e ' > < / h 4 > < / p > " ) ;  
                  
                 i f ( i T y p e = = 0 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > I n p u t   a   S i n h a l a   n o u n   f o r m   t o   a n a l y z e ! < / p > " ) ;  
                 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                 }  
                 e l s e   i f ( i T y p e = = 1 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > G i v e n   w o r d   i s   e m p t y !   I n p u t   a   S i n h a l a   n o u n   f o r m   t o   a n a l y z e ! < / p > " ) ;  
                 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                 }  
                 e l s e  
                 {                 	  
                 	 P r i n t R e s u l t s T a b l e ( o u t ,   s N o u n ) ;  
                 	 o u t . p r i n t l n ( " < h r > < h 4   a l i g n = ' c e n t e r ' > W o r k i n g s < / h 4 > < p   a l i g n = ' c e n t e r '   i d = ' w o r k i n g _ p a n e l '   n a m e = ' w o r k i n g _ p a n e l ' > < / p > < h r > " ) ;                  
                 }                  
                                                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;                  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;                  
         }  
          
  
          
         p u b l i c   v o i d   P r i n t R e s u l t s T a b l e ( P r i n t W r i t e r   o u t ,   S t r i n g   s N o u n )  
         {  
         	 o u t . p r i n t l n ( " < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > " + s N o u n + "  ���    ���������� < / h 4 > < / p > " ) ;  
         	 o u t . p r i n t l n ( " < p   i d = ' t e m p _ p a n e l '   n a m e = ' t e m p _ p a n e l ' > < t e x t a r e a   i d = ' w o r k i n g s '   n a m e = ' w o r k i n g s '   c o l s = ' 5 0 '   r o w s = ' 1 4 '   r e a d o n l y > " ) ;  
         	         	  
         	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
         	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
         	  
         	 H B N o u n C o n j u g a t i o n R u l e s   o C o n j u g a t i o n R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( ) ;  
         	  
         	 H B N o u n   o N o u n   =   H B N o u n A n a l y z e r . A n a l y z e ( s N o u n ,   o C o n j u g a t i o n R u l e s ,   o N o u n S c o r e A l g o ,   o J o i n S c o r e A l g o ) ;  
  
         	 i f ( o N o u n ! = n u l l )  
         	 {  
         	 	 o N o u n . D e b u g P r i n t ( ) ;  
         	 }  
         	 / / o u t . p r i n t l n ( " \ ' ; < / s c r i p t > " ) ;  
         	 o u t . p r i n t l n ( " < / t e x t a r e a > " ) ;  
         	  
         	 i f ( o N o u n = = n u l l )  
         	 {  
         	 	 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > < f o n t   c o l o r = ' r e d ' > < h 4   a l i g n = ' c e n t e r ' > F a i l e d   t o   f i n d   a n y   v a l i d   c o n j u g a t i o n   p a t t e r n s ! < / h 4 > < / f o n t > < / p > " ) ;         	 	  
         	 }  
         	 e l s e  
         	 {         	 	  
         	 	 l o n g   l L e m m a I D   =   o N o u n . G e t L e m m a I D ( ) ;  
         	 	         	 	  
         	 	 o u t . p r i n t l n ( I d e n t i f y F o r m s ( o N o u n ,   s N o u n ) ) ;  
         	 	  
         	 	 o u t . p r i n t l n ( " < / f o r m > " ) ;  
         	 	  
         	 	 / / o u t . p r i n t l n ( " < f o r m   i d = ' f e x c e p '   a c t i o n = . / "   +   G e t M a n u a l I n p u t A c t i o n P a g e ( )   +   "   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;  
         	 	         	 	  
                 	 o u t . p r i n t l n ( " < t a b l e   b o r d e r = 1   a l i g n = ' c e n t e r ' > " ) ;         	  
                 	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > F o r m < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > S i n g u l a r < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > S i n g u l a r - I n d e f i n i t e < / f o n t > < / t d > " ) ;  
                 	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > P l u r a l < / f o n t > < / t d > < / t r > " ) ;         	  
                 	  
         	 	 P r i n t N o u n ( o u t ,   s N o u n ,   o N o u n ,   l L e m m a I D ) ;  
         	 	 o u t . p r i n t l n ( " < / t a b l e > " ) ;         	 	  
         	 	 o u t . p r i n t l n ( " < / f o r m > " ) ;   	 	   	 	         	 	         	 	         	 	  
         	 }         	  
         }  
          
         p r i v a t e   S t r i n g   I d e n t i f y F o r m s ( H B N o u n   o N o u n ,   S t r i n g   s I n p u t )  
         {         	  
         	 S t r i n g   s T y p e   =   " " ;  
         	 S t r i n g   s S u b T y p e   =   " " ;  
         	 L i s t < H B F o r m >   l i s t F o r m s   =   o N o u n . I d e n t i f y ( s I n p u t ) ;  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s   . g e t ( i ) ;  
 	 	 	  
 	 	 	 S t r i n g   s T y p e 1   =   H B N o u n . a r r _ V i b h a k t h i _ s [ o F o r m . G e t T y p e ( ) ] ;  
 	 	 	 S t r i n g   s S u b T y p e 1   =   H B N o u n . a r r _ N o u n C a t e g o r i e s _ s [ o F o r m . G e t S u b T y p e ( ) ] ;  
 	 	 	  
 	 	 	 i f ( s T y p e . l e n g t h ( )   = =   0 )  
 	 	 	 {  
 	 	 	 	 s T y p e   =   s T y p e 1 ;  
 	 	 	 }  
 	 	 	 e l s e   i f ( ! s T y p e . e q u a l s ( s T y p e 1 ) )  
 	 	 	 {  
 	 	 	 	 s T y p e   + =   " ,   "   +   s T y p e 1 ;  
 	 	 	 }  
 	 	 	  
 	 	 	 i f ( s S u b T y p e . l e n g t h ( )   = =   0 )  
 	 	 	 {  
 	 	 	 	 s S u b T y p e   =   s S u b T y p e 1 ;  
 	 	 	 }  
 	 	 	 e l s e   i f ( ! s S u b T y p e . e q u a l s ( s S u b T y p e 1 ) )  
 	 	 	 {  
 	 	 	 	 s S u b T y p e   + =   " ,   "   +   s S u b T y p e 1 ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 S t r i n g   s O u t   =   " < t a b l e   b o r d e r = 1   a l i g n = ' c e n t e r ' > " ;  
         	 s O u t   + =   " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >�� ������     < / f o n t > < / t d > < t d > " +   o N o u n . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( )   +   " < / t d > < / t r > " ;  
         	 s O u t   + =   " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >����   < / f o n t > < / t d > < t d > " +   s S u b T y p e   +   " < / t d > < / t r > " ;  
         	 s O u t   + =   " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' >��������   < / f o n t > < / t d > < t d > " +   s T y p e   +   " < / t d > < / t r > " ;  
         	 s O u t   + =   " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > S c o r e   < / f o n t > < / t d > < t d > " +   o N o u n . G e t S c o r e ( )   +   " < / t d > < / t r > " ;  
         	 s O u t   + =   " < / t a b l e > " ;      
 	 	 	 	 	 	  
         	 r e t u r n   s O u t ;  
         }  
          
         p r i v a t e   v o i d   P r i n t N o u n ( P r i n t W r i t e r   o u t ,   S t r i n g   s I n p u t ,   H B N o u n   o N o u n ,   l o n g   l L e m m a I D )  
         { 	  
         	 f o r ( i n t   i = 0 ;   i < 9 ;   i + + )  
         	 {  
         	 	 i f ( i = = 0   | |   i = = 1   | |   i = = 8 )  
         	 	 {  
         	 	 	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f c c 2 9 f ' > "   +   H B N o u n . a r r _ V i b h a k t h i _ s [ i ]   +   " < / f o n t > < / t d > " ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > "   +   H B N o u n . a r r _ V i b h a k t h i _ s [ i ]   +   " < / f o n t > < / t d > " ) ;  
         	 	 }         	 	  
         	 	  
                 	 P r i n t R e s u l t s C e l l ( o u t ,   s I n p u t ,   o N o u n . G e t N o u n F o r m s ( i ,   0 ) ,   " F "   +   i   +   " 0 " ) ;  
                 	 P r i n t R e s u l t s C e l l ( o u t ,   s I n p u t ,   o N o u n . G e t N o u n F o r m s ( i ,   1 ) ,   " F "   +   i   +   " 1 " ) ;  
                 	 P r i n t R e s u l t s C e l l ( o u t ,   s I n p u t ,   o N o u n . G e t N o u n F o r m s ( i ,   2 ) ,   " F "   +   i   +   " 2 " ) ;  
                 	  
                 	 o u t . p r i n t l n ( " < / t r > " ) ;  
         	 }         	  
         }  
          
         p r o t e c t e d   v o i d   P r i n t R e s u l t s C e l l ( P r i n t W r i t e r   o u t ,   S t r i n g   s I n p u t ,   L i s t < H B F o r m >   l i s t F o r m s ,   S t r i n g   s C o n t r o l N a m e )  
         {        
         	 S t r i n g B u f f e r   s b O u t   =   n e w   S t r i n g B u f f e r ( ) ;  
         	 i f ( l i s t F o r m s ! = n u l l )  
         	 {  
 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	  
 	 	 	 	 i f ( s I n p u t . e q u a l s ( o F o r m . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 s b O u t . a p p e n d ( " < b > < f o n t   c o l o r = ' r e d ' > " ) ;  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 	 {  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 s b O u t . a p p e n d ( o F o r m . G e t N a t u r a l F o r m ( ) ) . a p p e n d ( " ,   " ) ; 	 	 	 	 	  
 	 	 	 	 }  
  
 	 	 	 	 i f ( s I n p u t . e q u a l s ( o F o r m . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 	 {  
 	 	 	 	 	 s b O u t . a p p e n d ( " < / f o n t > < / b > " ) ;  
 	 	 	 	 } 	 	 	 	  
 	 	 	 }  
         	 }         	         	  
       	 	 o u t . p r i n t l n ( " < t d   c e l l p a d d i n g = ' 0 '     c e l l s p a c i n g = ' 0 ' > " ) ;         	  
         	 o u t . p r i n t l n ( s b O u t . t o S t r i n g ( ) ) ;  
 	 	 o u t . p r i n t l n ( " < / t d > " ) ;         	  
         }        
 }  
