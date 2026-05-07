def Min_total_cost(goodies, ):
	pass

if __name__ == '__main__':
	
	N = int(input())
	goodies = {}

	for _ in range(N):
	    label, weight = input().split()   
	    weight = int(weight)


	    if label not in goodies:
	        goodies[label] = []
	    goodies[label].append(weight)

	K = int(input())