 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *   P h o n o t i c a l   a n a l y s i s   o f   a   g i v e   w o r d  
   * /  
 p a c k a g e   h e l a b a s a . s a n d h i ;  
  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B W o r d J o i n e r   {  
  
 	 p u b l i c   s t a t i c   f i n a l   i n t   J O I N _ M O D E _ U N I V E R S A L 	 =   4 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   J O I N _ M O D E _ N O U N 	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   J O I N _ M O D E _ V E R B 	 	 =   1 ;  
 	  
 	  
 	 p r i v a t e   s t a t i c   H B S t a n d a r d J o i n R u l e S e t   o _ S t d R u l e S e t   =   n e w   H B S t a n d a r d J o i n R u l e S e t ( ) ;  
 	  
 	 p u b l i c   H B W o r d J o i n e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
  
 	 p u b l i c   s t a t i c   H B J o i n R e s u l t s S e t   D i s j o i n ( H B W o r d   o W 1 ,   H B W o r d   o W 2 ,   i n t   i M o d e )  
 	 { 	 	  
 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s S e t   =   n e w   H B J o i n R e s u l t s S e t ( ) ;  
 	  
 	 	 i f ( H e l a b a s a . I s D i s j o i n a b l e ( o W 1 ,   o W 2 ) )  
 	 	 {  
 	 	 	 o _ S t d R u l e S e t . D i s j o i n ( o W 1 ,   o W 2 ,   o R e s u l t s S e t ,   i M o d e ) ; 	  
 	 	 }  
 	 	  
 	 	 r e t u r n   o R e s u l t s S e t ;  
 	 } 	  
  
 	 p u b l i c   s t a t i c   v o i d   J o i n ( H B W o r d   o W 1 ,   H B W o r d   o W 2 ,   i n t   i M e t h o d ,   H B J o i n R e s u l t s S e t   o R e s u l t S e t ,   i n t   i M o d e )  
 	 {  
 	 	 / / L i s t < H B W o r d >   l s t O u t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 o _ S t d R u l e S e t . J o i n ( o W 1 ,   o W 2 ,   i M e t h o d ,   o R e s u l t S e t ,   i M o d e ) ;  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . w r i t e ( " J o i n i n g   :   "   +   o W 1 . G e t B a s e F o r m ( )   +   "   a n d   "   +   o W 2 . G e t B a s e F o r m ( )   +   "   u s i n g     m e t h o d   "   +   i M e t h o d ) ;  
 	 	 / / T O D O   P a s s   t h e   R e s u l t s S e t   t o   J o i n   R u l e s  
 	 	  
 / / 	 	 i n t   i C o u n t   =   l s t O u t . s i z e ( ) ;  
 / / 	 	  
 / / 	 	 f o r ( i n t   i = i C o u n t - 1 ;   i > = 0 ;   i - - )  
 / / 	 	 {  
 / / 	 	 	 H B W o r d   o W o r d   =   l s t O u t . g e t ( i ) ;  
 / / 	 	 	  
 / / 	 	 	 o R e s u l t S e t . A d d ( o W 1 ,   o W 2 ,   o W o r d ,   i M e t h o d ) ; 	 	 	  
 / / 	 	 } 	  
 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   H B J o i n R e s u l t s S e t   J o i n ( H B W o r d   o W 1 ,   H B W o r d   o W 2 ,   i n t   i M o d e )  
 	 { 	 	 	 	  
 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s S e t   =   n e w   H B J o i n R e s u l t s S e t ( ) ; 	  
 	 	  
 	 	 o _ S t d R u l e S e t . J o i n ( o W 1 ,   o W 2 ,   o R e s u l t s S e t ,   i M o d e ) ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B J o i n R e s u l t s S e t : : J o i n   :   "   +   o W 1 . G e t B a s e F o r m ( )   +   "   +   "   +   o W 2 . G e t B a s e F o r m ( )   +   "   :   M O D E = "   +   i M o d e   +   "   :   R e s u l t s = "   +   o R e s u l t s S e t . G e t R e s u l t s C o u n t ( ) ) ;  
  
 	 	 r e t u r n   o R e s u l t s S e t ;  
 	 }  
 	  
 	 	 	  
  
 / / 	 p u b l i c   s t a t i c   L i s t < H B W o r d >   D i s j o i n ( H B W o r d   o W 1 ,   H B W o r d   o S u f f i x ,   b o o l e a n   b L o a d F r e q u e n c y ,   l o n g   l T h r e s h o l d ,   i n t   i M o d e )  
 / / 	 { 	 	  
 / / 	 	  
 / / 	 	 L i s t < H B W o r d >   l s t O u t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 / / 	 	 o _ S t d R u l e S e t . D i s j o i n ( o W 1 ,   o S u f f i x ,   l s t O u t ,   i M o d e ) ;  
 / / 	 	  
 / / 	 	 / / H e l a b a s a . G e t L o g ( ) . w r i t e ( " J o i n i n g   :   "   +   o W 1 . G e t B a s e F o r m ( )   +   "   a n d   "   +   o W 2 . G e t B a s e F o r m ( )   +   "   u s i n g     m e t h o d   "   +   i M e t h o d ) ;  
 / / 	 	  
 / / 	 	 i f ( b L o a d F r e q u e n c y   & &   l T h r e s h o l d > 0 )  
 / / 	 	 {  
 / / 	 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l s t O u t ) ;  
 / / 	 	 } 	 	  
 / / 	 	  
 / / 	 	 i n t   i C o u n t   =   l s t O u t . s i z e ( ) ;  
 / / 	 	  
 / / 	 	 f o r ( i n t   i = i C o u n t - 1 ;   i > = 0 ;   i - - )  
 / / 	 	 {  
 / / 	 	 	 H B W o r d   o W o r d   =   l s t O u t . g e t ( i ) ;  
 / / 	 	 	 i f ( o W o r d . G e t F r e q u e n c y ( )   <   l T h r e s h o l d )  
 / / 	 	 	 {  
 / / 	 	 	 	 l s t O u t . r e m o v e ( i ) ;  
 / / 	 	 	 }  
 / / 	 	 }  
 / / 	 	 r e t u r n   l s t O u t ;  
 / / 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   D i s j o i n ( H B W o r d   o W 1 ,   H B W o r d   o S u f f i x ,   H B J o i n R e s u l t s S e t   o R e s u l t S e t ,   i n t   i M o d e )  
 	 { 	 	 	  
 	 	 i f ( H e l a b a s a . I s D i s j o i n a b l e ( o W 1 ,   o S u f f i x ) )  
 	 	 {  
 	 	 	 o _ S t d R u l e S e t . D i s j o i n ( o W 1 ,   o S u f f i x ,   o R e s u l t S e t ,   i M o d e ) ;  
 	 	 }  
 	 	 / / H e l a b a s a . G e t L o g ( ) . w r i t e ( " J o i n i n g   :   "   +   o W 1 . G e t B a s e F o r m ( )   +   "   a n d   "   +   o W 2 . G e t B a s e F o r m ( )   +   "   u s i n g     m e t h o d   "   +   i M e t h o d ) ; 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   C h e c k D i s j o i n a b l e ( H B W o r d   o W 1 ,   H B W o r d   o S u f f i x ,   b o o l e a n   b L o a d F r e q u e n c y ,   l o n g   l T h r e s h o l d ,   i n t   i M o d e )  
 	 { 	 	 	 	  
 	 	 / / T O D O   -   r e m o v e   t h e   o t h e r   p a r a m s  
 	 	 i f ( H e l a b a s a . I s D i s j o i n a b l e ( o W 1 ,   o S u f f i x ) )  
 	 	 {  
 	 	 	 r e t u r n   1 ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 / / 	 	 L i s t < H B W o r d >   l s t O u t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 / / 	 	  
 / / 	 	 H B J o i n R e s u l t s S e t   o R e s u l t S e t   =   D i s j o i n ( o W 1 ,   o S u f f i x ,   i M o d e ) ;  
 / / 	 	  
 / / 	 	 H e l a b a s a . G e t L o g ( ) . w r i t e ( " < b > C h e c k D i s j o i n a b l e   :   [ "   +   o W 1 . G e t B a s e F o r m ( )   +   " ]   - - - -   [ "   +   o S u f f i x . G e t B a s e F o r m ( )   +   " ]   :   C o m b i n a t i o n s = "   +   l s t O u t . s i z e ( ) + " < / b > < b r > \ r \ n " ) ;  
 / / 	 	  
 / / 	 	 i n t   i C o u n t   =   o R e s u l t S e t . G e t R e s u l t s C o u n t ( ) ;  
 / / 	 	  
 / / 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 / / 	 	 {  
 / / 	 	 	 H B J o i n R e s u l t s   o R e s u l t   =   o R e s u l t S e t . G e t R e s u l t s A t ( i ) ;  
 / / 	 	 	 l s t O u t . a d d ( o R e s u l t . G e t R e s u l t ( ) ) ;  
 / / 	 	 }  
 / / 	 	  
 / / 	 	 i f ( b L o a d F r e q u e n c y   & &   i C o u n t > 0   & &   l T h r e s h o l d > 0 )  
 / / 	 	 { 	 	 	  
 / / 	 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l s t O u t ) ;  
 / / 	 	 } 	 	  
 / / 	 	 e l s e  
 / / 	 	 {  
 / / 	 	 	 r e t u r n   l s t O u t . s i z e ( ) ;  
 / / 	 	 }  
 / / 	 	 	 	  
 / / 	 	 l o n g   i M a x F r e q   =   0 ;  
 / / 	 	 f o r ( i n t   i = i C o u n t - 1 ;   i > = 0 ;   i - - )  
 / / 	 	 {  
 / / 	 	 	 H B W o r d   o W o r d   =   l s t O u t . g e t ( i ) ;  
 / / 	 	 	  
 / / 	 	 	 / / H e l a b a s a . G e t L o g ( ) . w r i t e ( o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   S c o r e = "   +   o W o r d . G e t F r e q u e n c y ( )   + " < b r > \ r \ n " ) ;  
 / / 	 	 	  
 / / 	 	 	 i f ( o W o r d . G e t F r e q u e n c y ( )   > =   l T h r e s h o l d )  
 / / 	 	 	 {  
 / / 	 	 	 	 i f ( i M a x F r e q   <   o W o r d . G e t F r e q u e n c y ( )   )  
 / / 	 	 	 	 {  
 / / 	 	 	 	 	 i M a x F r e q   =   o W o r d . G e t F r e q u e n c y ( ) ;  
 / / 	 	 	 	 }  
 / / 	 	 	 }  
 / / 	 	 }  
 / / 	 	 r e t u r n   i M a x F r e q ;  
 	 } 	  
 	  
 	  
 	  
 }  
