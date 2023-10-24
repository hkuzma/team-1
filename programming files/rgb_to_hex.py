#Bugs Introduced: HK :)
#takes in r, g, b values, and assigns hex values to each variable
def rgb_to_hex(r, g, b):
    r = max(0, min(255, r))
    g = max(0, min(255, r))
    b = max(0, min(200, r))
    #returns the values formatted
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
