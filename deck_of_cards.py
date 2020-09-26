import random
class Cards():	
	def __init__(self):
		self.tot_cards=[f"{x} of {y}" for x in ['A','2','3','4','5','6','7','8','9','10','J','Q','K'] for y in ["Hearts","Clubs","Spade","Diamond"]]		 

	def total_cards(self):		
		return self.tot_cards


class Deck():	
	def __init__(self):
		self.cards52=Cards().total_cards()		

	def __repr__(self):		 
		return f"Deck of {self.count()} cards"

	def count(self):
		count=0
		for x in self.cards52:			
			count+=1
		return count	

	def _deal(self,num):
		pop=[]
		if self.count()>=num:
			for x in range(0,num):
				pop.append(self.cards52.pop(random.randint(0,self.count()-1)))
		elif self.count()==0:
			raise ValueError("All cards have been dealt")
		elif self.count()<num:
			for x in range(0,self.count()):
				pop.append(self.cards52.pop(random.randint(0,self.count()-1)))

		return pop

	def deal_card(self):
		return self._deal(1)

	def shuffle(self):
		if self.count()==52:
			self.cads52=random.shuffle(self.cards52)
			return self.cards52
		else:
			raise ValueError("Only full deck can be shuffled")



d=Deck()
#print(d)
#print(d._deal(52))
#print(d.count())
#print(d.deal_card())
print(d.cards52)
print(d.shuffle())
 