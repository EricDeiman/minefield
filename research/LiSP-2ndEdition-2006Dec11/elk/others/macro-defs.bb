(INSTALL-GLOBAL-TRANSFORMER (QUOTE WITH-SYNTAX) (LAMBDA (:-D.X2101) ((LAMBDA (:-D.X2102) ((LAMBDA (:-D.Y2103) (IF :-D.Y2103 ((LAMBDA (:-D._2122 :-D.E12123 :-D.E22124) (CONS (QUOTE BEGIN) (CONS :-D.E12123 :-D.E22124))) (CAR :-D.Y2103) (CADR :-D.Y2103) (CADDR :-D.Y2103)) ((LAMBDA (:-D.X2104) ((LAMBDA (:-D.Y2105) (IF :-D.Y2105 (APPLY (LAMBDA (:-D._2116 :-D.OUT2117 :-D.IN2118 :-D.E12119 :-D.E22120) (LIST (QUOTE SYNTAX-CASE) :-D.IN2118 (QUOTE ()) (LIST :-D.OUT2117 (CONS (QUOTE BEGIN) (CONS :-D.E12119 :-D.E22120))))) :-D.Y2105) ((LAMBDA (:-D.X2106) ((LAMBDA (:-D.Y2107) (IF :-D.Y2107 (APPLY (LAMBDA (:-D._2108 :-D.OUT2109 :-D.IN2110 :-D.E12111 :-D.E22112) (LIST (QUOTE SYNTAX-CASE) (CONS (QUOTE LIST) :-D.IN2110) (QUOTE ()) (LIST :-D.OUT2109 (CONS (QUOTE BEGIN) (CONS :-D.E12111 :-D.E22112))))) :-D.Y2107) (SYNTAX-ERROR :-D.X2106))) (SYNTAX-DISPATCH :-D.X2106 (QUOTE (PAIR (ANY) PAIR (EACH PAIR (ANY) PAIR (ANY) ATOM) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2104))) (SYNTAX-DISPATCH :-D.X2104 (QUOTE (PAIR (ANY) PAIR (PAIR (PAIR (ANY) PAIR (ANY) ATOM) ATOM) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2102))) (SYNTAX-DISPATCH :-D.X2102 (QUOTE (PAIR (ANY) PAIR (ATOM) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2101)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE SYNTAX-RULES) (LAMBDA (:-D.X2126) ((LAMBDA (:-D.X2127) ((LAMBDA (:-D.Y2128) (IF :-D.Y2128 (APPLY (LAMBDA (:-D._2129 :-D.K2130 :-D.KEYWORD2131 :-D.PATTERN2132 :-D.TEMPLATE2133) ((LAMBDA (:-D.X2135) ((LAMBDA (:-D.Y2136) (IF :-D.Y2136 ((LAMBDA (:-D.DUMMY2137) (LIST (QUOTE LAMBDA) (LIST (QUOTE X)) (CONS (QUOTE SYNTAX-CASE) (CONS (QUOTE X) (CONS :-D.K2130 (MAP (LAMBDA (:-D.:-D.TEMPLATE21332141 :-D.:-D.PATTERN21322140 :-D.:-D.DUMMY21372139) (LIST (CONS :-D.:-D.DUMMY21372139 :-D.:-D.PATTERN21322140) (LIST (QUOTE SYNTAX) :-D.:-D.TEMPLATE21332141))) :-D.TEMPLATE2133 :-D.PATTERN2132 :-D.DUMMY2137)))))) (CAR :-D.Y2136)) (SYNTAX-ERROR :-D.X2135))) (SYNTAX-DISPATCH :-D.X2135 (QUOTE (EACH ANY)) (QUOTE #())))) (GENERATE-TEMPORARIES :-D.KEYWORD2131))) :-D.Y2128) (SYNTAX-ERROR :-D.X2127))) (SYNTAX-DISPATCH :-D.X2127 (QUOTE (PAIR (ANY) PAIR (EACH ANY) EACH PAIR (PAIR (ANY) ANY) PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2126)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE OR) (LAMBDA (:-D.X2142) ((LAMBDA (:-D.X2143) ((LAMBDA (:-D.Y2144) (IF :-D.Y2144 ((LAMBDA (:-D._2156) (QUOTE #f)) (CAR :-D.Y2144)) ((LAMBDA (:-D.X2145) ((LAMBDA (:-D.Y2146) (IF :-D.Y2146 ((LAMBDA (:-D._2154 :-D.E2155) :-D.E2155) (CAR :-D.Y2146) (CADR :-D.Y2146)) ((LAMBDA (:-D.X2147) ((LAMBDA (:-D.Y2148) (IF :-D.Y2148 ((LAMBDA (:-D._2149 :-D.E12150 :-D.E22151 :-D.E32152) (LIST (QUOTE LET) (LIST (LIST (QUOTE T) :-D.E12150)) (LIST (QUOTE IF) (QUOTE T) (QUOTE T) (CONS (QUOTE OR) (CONS :-D.E22151 :-D.E32152))))) (CAR :-D.Y2148) (CADR :-D.Y2148) (CADDR :-D.Y2148) (CADDDR :-D.Y2148)) (SYNTAX-ERROR :-D.X2147))) (SYNTAX-DISPATCH :-D.X2147 (QUOTE (PAIR (ANY) PAIR (ANY) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2145))) (SYNTAX-DISPATCH :-D.X2145 (QUOTE (PAIR (ANY) PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2143))) (SYNTAX-DISPATCH :-D.X2143 (QUOTE (PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2142)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE AND) (LAMBDA (:-D.X2157) ((LAMBDA (:-D.X2158) ((LAMBDA (:-D.Y2159) (IF :-D.Y2159 ((LAMBDA (:-D._2167 :-D.E12168 :-D.E22169 :-D.E32170) (CONS (QUOTE IF) (CONS :-D.E12168 (CONS (CONS (QUOTE AND) (CONS :-D.E22169 :-D.E32170)) (QUOTE (#f)))))) (CAR :-D.Y2159) (CADR :-D.Y2159) (CADDR :-D.Y2159) (CADDDR :-D.Y2159)) ((LAMBDA (:-D.X2160) ((LAMBDA (:-D.Y2161) (IF :-D.Y2161 ((LAMBDA (:-D._2165 :-D.E2166) :-D.E2166) (CAR :-D.Y2161) (CADR :-D.Y2161)) ((LAMBDA (:-D.X2162) ((LAMBDA (:-D.Y2163) (IF :-D.Y2163 ((LAMBDA (:-D._2164) (QUOTE #t)) (CAR :-D.Y2163)) (SYNTAX-ERROR :-D.X2162))) (SYNTAX-DISPATCH :-D.X2162 (QUOTE (PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2160))) (SYNTAX-DISPATCH :-D.X2160 (QUOTE (PAIR (ANY) PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2158))) (SYNTAX-DISPATCH :-D.X2158 (QUOTE (PAIR (ANY) PAIR (ANY) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2157)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE COND) (LAMBDA (:-D.X2172) ((LAMBDA (:-D.X2173) ((LAMBDA (:-D.Y2174) (IF :-D.Y2174 ((LAMBDA (:-D._2216 :-D.E12217 :-D.E22218) (CONS (QUOTE BEGIN) (CONS :-D.E12217 :-D.E22218))) (CAR :-D.Y2174) (CADR :-D.Y2174) (CADDR :-D.Y2174)) ((LAMBDA (:-D.X2175) ((LAMBDA (:-D.Y2176) (IF :-D.Y2176 ((LAMBDA (:-D._2214 :-D.E02215) (LIST (QUOTE LET) (LIST (LIST (QUOTE T) :-D.E02215)) (LIST (QUOTE IF) (QUOTE T) (QUOTE T)))) (CAR :-D.Y2176) (CADR :-D.Y2176)) ((LAMBDA (:-D.X2177) ((LAMBDA (:-D.Y2178) (IF :-D.Y2178 ((LAMBDA (:-D._2209 :-D.E02210 :-D.C12211 :-D.C22212) (LIST (QUOTE LET) (LIST (LIST (QUOTE T) :-D.E02210)) (LIST (QUOTE IF) (QUOTE T) (QUOTE T) (CONS (QUOTE COND) (CONS :-D.C12211 :-D.C22212))))) (CAR :-D.Y2178) (CADR :-D.Y2178) (CADDR :-D.Y2178) (CADDDR :-D.Y2178)) ((LAMBDA (:-D.X2179) ((LAMBDA (:-D.Y2180) (IF :-D.Y2180 ((LAMBDA (:-D._2206 :-D.E02207 :-D.E12208) (LIST (QUOTE LET) (LIST (LIST (QUOTE T) :-D.E02207)) (LIST (QUOTE IF) (QUOTE T) (LIST :-D.E12208 (QUOTE T))))) (CAR :-D.Y2180) (CADR :-D.Y2180) (CADDR :-D.Y2180)) ((LAMBDA (:-D.X2181) ((LAMBDA (:-D.Y2182) (IF :-D.Y2182 (APPLY (LAMBDA (:-D._2200 :-D.E02201 :-D.E12202 :-D.C12203 :-D.C22204) (LIST (QUOTE LET) (LIST (LIST (QUOTE T) :-D.E02201)) (LIST (QUOTE IF) (QUOTE T) (LIST :-D.E12202 (QUOTE T)) (CONS (QUOTE COND) (CONS :-D.C12203 :-D.C22204))))) :-D.Y2182) ((LAMBDA (:-D.X2183) ((LAMBDA (:-D.Y2184) (IF :-D.Y2184 ((LAMBDA (:-D._2195 :-D.E02196 :-D.E12197 :-D.E22198) (LIST (QUOTE IF) :-D.E02196 (CONS (QUOTE BEGIN) (CONS :-D.E12197 :-D.E22198)))) (CAR :-D.Y2184) (CADR :-D.Y2184) (CADDR :-D.Y2184) (CADDDR :-D.Y2184)) ((LAMBDA (:-D.X2185) ((LAMBDA (:-D.Y2186) (IF :-D.Y2186 (APPLY (LAMBDA (:-D._2187 :-D.E02188 :-D.E12189 :-D.E22190 :-D.C12191 :-D.C22192) (LIST (QUOTE IF) :-D.E02188 (CONS (QUOTE BEGIN) (CONS :-D.E12189 :-D.E22190)) (CONS (QUOTE COND) (CONS :-D.C12191 :-D.C22192)))) :-D.Y2186) (SYNTAX-ERROR :-D.X2185))) (SYNTAX-DISPATCH :-D.X2185 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) PAIR (ANY) EACH ANY) PAIR (ANY) EACH ANY)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2183))) (SYNTAX-DISPATCH :-D.X2183 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) PAIR (ANY) EACH ANY) ATOM)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2181))) (SYNTAX-DISPATCH :-D.X2181 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) PAIR (FREE-ID . 1) PAIR (ANY) ATOM) PAIR (ANY) EACH ANY)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2179))) (SYNTAX-DISPATCH :-D.X2179 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) PAIR (FREE-ID . 1) PAIR (ANY) ATOM) ATOM)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2177))) (SYNTAX-DISPATCH :-D.X2177 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) ATOM) PAIR (ANY) EACH ANY)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2175))) (SYNTAX-DISPATCH :-D.X2175 (QUOTE (PAIR (ANY) PAIR (PAIR (ANY) ATOM) ATOM)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2173))) (SYNTAX-DISPATCH :-D.X2173 (QUOTE (PAIR (ANY) PAIR (PAIR (FREE-ID . 0) PAIR (ANY) EACH ANY) ATOM)) (VECTOR (QUOTE ELSE) (QUOTE =>))))) :-D.X2172)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE LET*) (LAMBDA (:-D.X2220) ((LAMBDA (:-D.X2221) ((LAMBDA (:-D.Y2222) (IF :-D.Y2222 ((LAMBDA (:-D.LET*2237 :-D.E12238 :-D.E22239) (CONS (QUOTE LET) (CONS (QUOTE ()) (CONS :-D.E12238 :-D.E22239)))) (CAR :-D.Y2222) (CADR :-D.Y2222) (CADDR :-D.Y2222)) ((LAMBDA (:-D.X2223) ((LAMBDA (:-D.DOREST2224) ((LAMBDA (:-D.Y2225) (IF :-D.Y2225 (APPLY (LAMBDA (:-D.LET*2226 :-D.X12227 :-D.V12228 :-D.X22229 :-D.V22230 :-D.E12231 :-D.E22232) (IF (ANDMAP IDENTIFIER? (CONS :-D.X12227 :-D.X22229)) (LIST (QUOTE LET) (LIST (LIST :-D.X12227 :-D.V12228)) (CONS :-D.LET*2226 (CONS (MAP LIST :-D.X22229 :-D.V22230) (CONS :-D.E12231 :-D.E22232)))) (:-D.DOREST2224))) :-D.Y2225) (:-D.DOREST2224))) (SYNTAX-DISPATCH :-D.X2223 (QUOTE (PAIR (ANY) PAIR (PAIR (PAIR (ANY) PAIR (ANY) ATOM) EACH PAIR (ANY) PAIR (ANY) ATOM) PAIR (ANY) EACH ANY)) (QUOTE #())))) (LAMBDA () (SYNTAX-ERROR :-D.X2223)))) :-D.X2221))) (SYNTAX-DISPATCH :-D.X2221 (QUOTE (PAIR (ANY) PAIR (ATOM) PAIR (ANY) EACH ANY)) (QUOTE #())))) :-D.X2220)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE CASE) (LAMBDA (:-D.X2241) ((LAMBDA (:-D.X2242) ((LAMBDA (:-D.Y2243) (IF :-D.Y2243 ((LAMBDA (:-D._2265 :-D.V2266 :-D.E12267 :-D.E22268) (CONS (QUOTE BEGIN) (CONS :-D.V2266 (CONS :-D.E12267 :-D.E22268)))) (CAR :-D.Y2243) (CADR :-D.Y2243) (CADDR :-D.Y2243) (CADDDR :-D.Y2243)) ((LAMBDA (:-D.X2244) ((LAMBDA (:-D.Y2245) (IF :-D.Y2245 (APPLY (LAMBDA (:-D._2258 :-D.V2259 :-D.K2260 :-D.E12261 :-D.E22262) (LIST (QUOTE IF) (LIST (QUOTE MEMV) :-D.V2259 (LIST (QUOTE QUOTE) :-D.K2260)) (CONS (QUOTE BEGIN) (CONS :-D.E12261 :-D.E22262)))) :-D.Y2245) ((LAMBDA (:-D.X2246) ((LAMBDA (:-D.Y2247) (IF :-D.Y2247 (APPLY (LAMBDA (:-D._2248 :-D.V2249 :-D.K2250 :-D.E12251 :-D.E22252 :-D.C12253 :-D.C22254) (LIST (QUOTE LET) (LIST (LIST (QUOTE X) :-D.V2249)) (LIST (QUOTE IF) (LIST (QUOTE MEMV) (QUOTE X) (LIST (QUOTE QUOTE) :-D.K2250)) (CONS (QUOTE BEGIN) (CONS :-D.E12251 :-D.E22252)) (CONS (QUOTE CASE) (CONS (QUOTE X) (CONS :-D.C12253 :-D.C22254)))))) :-D.Y2247) (SYNTAX-ERROR :-D.X2246))) (SYNTAX-DISPATCH :-D.X2246 (QUOTE (PAIR (ANY) PAIR (ANY) PAIR (PAIR (EACH ANY) PAIR (ANY) EACH ANY) PAIR (ANY) EACH ANY)) (VECTOR (QUOTE ELSE))))) :-D.X2244))) (SYNTAX-DISPATCH :-D.X2244 (QUOTE (PAIR (ANY) PAIR (ANY) PAIR (PAIR (EACH ANY) PAIR (ANY) EACH ANY) ATOM)) (VECTOR (QUOTE ELSE))))) :-D.X2242))) (SYNTAX-DISPATCH :-D.X2242 (QUOTE (PAIR (ANY) PAIR (ANY) PAIR (PAIR (FREE-ID . 0) PAIR (ANY) EACH ANY) ATOM)) (VECTOR (QUOTE ELSE))))) :-D.X2241)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE DO) (LAMBDA (:-D.ORIG-X2270) ((LAMBDA (:-D.X2271) ((LAMBDA (:-D.Y2272) (IF :-D.Y2272 (APPLY (LAMBDA (:-D._2273 :-D.VAR2274 :-D.INIT2275 :-D.STEP2276 :-D.E02277 :-D.E12278 :-D.C2279) ((LAMBDA (:-D.X2292) ((LAMBDA (:-D.Y2293) (IF :-D.Y2293 ((LAMBDA (:-D.STEP2294) ((LAMBDA (:-D.X2296) ((LAMBDA (:-D.Y2297) (IF :-D.Y2297 (LIST (QUOTE LET) (QUOTE DOLOOP) (MAP LIST :-D.VAR2274 :-D.INIT2275) (LIST (QUOTE IF) (LIST (QUOTE NOT) :-D.E02277) (CONS (QUOTE BEGIN) (APPEND :-D.C2279 (LIST (CONS (QUOTE DOLOOP) :-D.STEP2294)))))) ((LAMBDA (:-D.X2298) ((LAMBDA (:-D.Y2299) (IF :-D.Y2299 ((LAMBDA (:-D.E2300) (LIST (QUOTE LET) (QUOTE DOLOOP) (MAP LIST :-D.VAR2274 :-D.INIT2275) (LIST (QUOTE IF) :-D.E02277 :-D.E2300 (CONS (QUOTE BEGIN) (APPEND :-D.C2279 (LIST (CONS (QUOTE DOLOOP) :-D.STEP2294))))))) (CAR :-D.Y2299)) (SYNTAX-ERROR :-D.X2298))) (SYNTAX-DISPATCH :-D.X2298 (QUOTE (PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2296))) (SYNTAX-DISPATCH :-D.X2296 (QUOTE (ATOM)) (QUOTE #())))) :-D.E12278)) (CAR :-D.Y2293)) (SYNTAX-ERROR :-D.X2292))) (SYNTAX-DISPATCH :-D.X2292 (QUOTE (EACH ANY)) (QUOTE #())))) (MAP (LAMBDA (:-D.V2282 :-D.S2283) ((LAMBDA (:-D.X2284) ((LAMBDA (:-D.Y2285) (IF :-D.Y2285 :-D.V2282 ((LAMBDA (:-D.X2286) ((LAMBDA (:-D.Y2287) (IF :-D.Y2287 ((LAMBDA (:-D.E2291) :-D.E2291) (CAR :-D.Y2287)) ((LAMBDA (:-D.X2288) ((LAMBDA (:-D.Y2289) (IF :-D.Y2289 ((LAMBDA (:-D._2290) (SYNTAX-ERROR :-D.ORIG-X2270)) (CAR :-D.Y2289)) (SYNTAX-ERROR :-D.X2288))) (SYNTAX-DISPATCH :-D.X2288 (QUOTE (ANY)) (QUOTE #())))) :-D.X2286))) (SYNTAX-DISPATCH :-D.X2286 (QUOTE (PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2284))) (SYNTAX-DISPATCH :-D.X2284 (QUOTE (ATOM)) (QUOTE #())))) :-D.S2283)) :-D.VAR2274 :-D.STEP2276))) :-D.Y2272) (SYNTAX-ERROR :-D.X2271))) (SYNTAX-DISPATCH :-D.X2271 (QUOTE (PAIR (ANY) PAIR (EACH PAIR (ANY) PAIR (ANY) ANY) PAIR (PAIR (ANY) EACH ANY) EACH ANY)) (QUOTE #())))) :-D.ORIG-X2270)))
(INSTALL-GLOBAL-TRANSFORMER (QUOTE QUASIQUOTE) (LETREC ((:-D.GEN-CONS2309 (LAMBDA (:-D.X2318 :-D.Y2319) ((LAMBDA (:-D.X2320) ((LAMBDA (:-D.Y2321) (IF :-D.Y2321 ((LAMBDA (:-D.X2334) ((LAMBDA (:-D.X2335) ((LAMBDA (:-D.Y2336) (IF :-D.Y2336 ((LAMBDA (:-D.Y2344) (LIST (QUOTE QUOTE) (CONS :-D.X2334 :-D.Y2344))) (CAR :-D.Y2336)) ((LAMBDA (:-D.X2337) ((LAMBDA (:-D.Y2338) (IF :-D.Y2338 ((LAMBDA (:-D.Y2342) (CONS (QUOTE LIST) (CONS (LIST (QUOTE QUOTE) :-D.X2334) :-D.Y2342))) (CAR :-D.Y2338)) ((LAMBDA (:-D.X2339) ((LAMBDA (:-D.Y2340) (IF :-D.Y2340 ((LAMBDA (:-D.Y2341) (LIST (QUOTE CONS) (LIST (QUOTE QUOTE) :-D.X2334) :-D.Y2341)) (CAR :-D.Y2340)) (SYNTAX-ERROR :-D.X2339))) (SYNTAX-DISPATCH :-D.X2339 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2337))) (SYNTAX-DISPATCH :-D.X2337 (QUOTE (PAIR (FREE-ID . 1) EACH ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2335))) (SYNTAX-DISPATCH :-D.X2335 (QUOTE (PAIR (FREE-ID . 0) PAIR (ANY) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.Y2319)) (CAR :-D.Y2321)) ((LAMBDA (:-D.X2322) ((LAMBDA (:-D.Y2323) (IF :-D.Y2323 ((LAMBDA (:-D.X2324) ((LAMBDA (:-D.X2325) ((LAMBDA (:-D.Y2326) (IF :-D.Y2326 (LIST (QUOTE LIST) :-D.X2324) ((LAMBDA (:-D.X2327) ((LAMBDA (:-D.Y2328) (IF :-D.Y2328 ((LAMBDA (:-D.Y2332) (CONS (QUOTE LIST) (CONS :-D.X2324 :-D.Y2332))) (CAR :-D.Y2328)) ((LAMBDA (:-D.X2329) ((LAMBDA (:-D.Y2330) (IF :-D.Y2330 ((LAMBDA (:-D.Y2331) (LIST (QUOTE CONS) :-D.X2324 :-D.Y2331)) (CAR :-D.Y2330)) (SYNTAX-ERROR :-D.X2329))) (SYNTAX-DISPATCH :-D.X2329 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2327))) (SYNTAX-DISPATCH :-D.X2327 (QUOTE (PAIR (FREE-ID . 1) EACH ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2325))) (SYNTAX-DISPATCH :-D.X2325 (QUOTE (PAIR (FREE-ID . 0) PAIR (ATOM) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.Y2319)) (CAR :-D.Y2323)) (SYNTAX-ERROR :-D.X2322))) (SYNTAX-DISPATCH :-D.X2322 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE))))) :-D.X2320))) (SYNTAX-DISPATCH :-D.X2320 (QUOTE (PAIR (FREE-ID . 0) PAIR (ANY) ATOM)) (VECTOR (QUOTE QUOTE))))) :-D.X2318))) (:-D.GEN-APPEND2310 (LAMBDA (:-D.X2345 :-D.Y2346) ((LAMBDA (:-D.X2347) ((LAMBDA (:-D.Y2348) (IF :-D.Y2348 ((LAMBDA (:-D.X12364 :-D.X22365) ((LAMBDA (:-D.X2366) ((LAMBDA (:-D.Y2367) (IF :-D.Y2367 ((LAMBDA (:-D.Y2372) (LIST (QUOTE QUOTE) (CONS :-D.X12364 (APPEND :-D.X22365 :-D.Y2372)))) (CAR :-D.Y2367)) ((LAMBDA (:-D.X2368) ((LAMBDA (:-D.Y2369) (IF :-D.Y2369 ((LAMBDA (:-D.Y2370) (LIST (QUOTE APPEND) (LIST (QUOTE QUOTE) (CONS :-D.X12364 :-D.X22365) :-D.Y2370))) (CAR :-D.Y2369)) (SYNTAX-ERROR :-D.X2368))) (SYNTAX-DISPATCH :-D.X2368 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE))))) :-D.X2366))) (SYNTAX-DISPATCH :-D.X2366 (QUOTE (PAIR (FREE-ID . 0) PAIR (ANY) ATOM)) (VECTOR (QUOTE QUOTE))))) :-D.Y2346)) (CAR :-D.Y2348) (CADR :-D.Y2348)) ((LAMBDA (:-D.X2349) ((LAMBDA (:-D.Y2350) (IF :-D.Y2350 :-D.Y2346 ((LAMBDA (:-D.X2351) ((LAMBDA (:-D.Y2352) (IF :-D.Y2352 ((LAMBDA (:-D.X12361 :-D.X22362) (:-D.GEN-CONS2309 :-D.X12361 (:-D.GEN-APPEND2310 (CONS (QUOTE LIST) :-D.X22362) :-D.Y2346))) (CAR :-D.Y2352) (CADR :-D.Y2352)) ((LAMBDA (:-D.X2353) ((LAMBDA (:-D.Y2354) (IF :-D.Y2354 ((LAMBDA (:-D.X2355) ((LAMBDA (:-D.X2356) ((LAMBDA (:-D.Y2357) (IF :-D.Y2357 :-D.X2355 ((LAMBDA (:-D.X2358) ((LAMBDA (:-D.Y2359) (IF :-D.Y2359 ((LAMBDA (:-D.Y2360) (LIST (QUOTE APPEND) :-D.X2355 :-D.Y2360)) (CAR :-D.Y2359)) (SYNTAX-ERROR :-D.X2358))) (SYNTAX-DISPATCH :-D.X2358 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2356))) (SYNTAX-DISPATCH :-D.X2356 (QUOTE (PAIR (FREE-ID . 0) PAIR (ATOM) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.Y2346)) (CAR :-D.Y2354)) (SYNTAX-ERROR :-D.X2353))) (SYNTAX-DISPATCH :-D.X2353 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST) (QUOTE CONS))))) :-D.X2351))) (SYNTAX-DISPATCH :-D.X2351 (QUOTE (PAIR (FREE-ID . 1) PAIR (ANY) EACH ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST) (QUOTE CONS))))) :-D.X2349))) (SYNTAX-DISPATCH :-D.X2349 (QUOTE (PAIR (FREE-ID . 0) PAIR (ATOM) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST) (QUOTE CONS))))) :-D.X2347))) (SYNTAX-DISPATCH :-D.X2347 (QUOTE (PAIR (FREE-ID . 0) PAIR (PAIR (ANY) EACH ANY) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST) (QUOTE CONS))))) :-D.X2345))) (:-D.GEN-VECTOR2311 (LAMBDA (:-D.X2374) ((LAMBDA (:-D.X2375) ((LAMBDA (:-D.Y2376) (IF :-D.Y2376 ((LAMBDA (:-D.X2384) (LIST (QUOTE QUOTE) (LIST->VECTOR :-D.X2384))) (CAR :-D.Y2376)) ((LAMBDA (:-D.X2377) ((LAMBDA (:-D.Y2378) (IF :-D.Y2378 ((LAMBDA (:-D.X2382) (CONS (QUOTE VECTOR) :-D.X2382)) (CAR :-D.Y2378)) ((LAMBDA (:-D.X2379) ((LAMBDA (:-D.Y2380) (IF :-D.Y2380 ((LAMBDA (:-D.X2381) (LIST (QUOTE LIST->VECTOR) :-D.X2381)) (CAR :-D.Y2380)) (SYNTAX-ERROR :-D.X2379))) (SYNTAX-DISPATCH :-D.X2379 (QUOTE (ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2377))) (SYNTAX-DISPATCH :-D.X2377 (QUOTE (PAIR (FREE-ID . 1) EACH ANY)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2375))) (SYNTAX-DISPATCH :-D.X2375 (QUOTE (PAIR (FREE-ID . 0) PAIR (EACH ANY) ATOM)) (VECTOR (QUOTE QUOTE) (QUOTE LIST))))) :-D.X2374))) (:-D.GEN2312 (LAMBDA (:-D.P2386 :-D.LEV2387) ((LAMBDA (:-D.X2388) ((LAMBDA (:-D.Y2389) (IF :-D.Y2389 ((LAMBDA (:-D.P2408) (IF (= :-D.LEV2387 (QUOTE 0)) :-D.P2408 (:-D.GEN-CONS2309 (LIST (QUOTE QUOTE) (QUOTE UNQUOTE)) (:-D.GEN2312 (LIST :-D.P2408) (- :-D.LEV2387 (QUOTE 1)))))) (CAR :-D.Y2389)) ((LAMBDA (:-D.X2390) ((LAMBDA (:-D.Y2391) (IF :-D.Y2391 ((LAMBDA (:-D.P2406 :-D.Q2407) (IF (= :-D.LEV2387 (QUOTE 0)) (:-D.GEN-APPEND2310 :-D.P2406 (:-D.GEN2312 :-D.Q2407 :-D.LEV2387)) (:-D.GEN-CONS2309 (:-D.GEN-CONS2309 (LIST (QUOTE QUOTE) (QUOTE UNQUOTE-SPLICING)) (:-D.GEN2312 :-D.P2406 (- :-D.LEV2387 (QUOTE 1)))) (:-D.GEN2312 :-D.Q2407 :-D.LEV2387)))) (CAR :-D.Y2391) (CADR :-D.Y2391)) ((LAMBDA (:-D.X2392) ((LAMBDA (:-D.Y2393) (IF :-D.Y2393 ((LAMBDA (:-D.P2405) (:-D.GEN-CONS2309 (LIST (QUOTE QUOTE) (QUOTE QUASIQUOTE)) (:-D.GEN2312 (LIST :-D.P2405) (+ :-D.LEV2387 (QUOTE 1))))) (CAR :-D.Y2393)) ((LAMBDA (:-D.X2394) ((LAMBDA (:-D.Y2395) (IF :-D.Y2395 ((LAMBDA (:-D.P2403 :-D.Q2404) (:-D.GEN-CONS2309 (:-D.GEN2312 :-D.P2403 :-D.LEV2387) (:-D.GEN2312 :-D.Q2404 :-D.LEV2387))) (CAR :-D.Y2395) (CADR :-D.Y2395)) ((LAMBDA (:-D.X2396) ((LAMBDA (:-D.Y2397) (IF :-D.Y2397 ((LAMBDA (:-D.X2401) (:-D.GEN-VECTOR2311 (:-D.GEN2312 :-D.X2401 :-D.LEV2387))) (CAR :-D.Y2397)) ((LAMBDA (:-D.X2398) ((LAMBDA (:-D.Y2399) (IF :-D.Y2399 ((LAMBDA (:-D.P2400) (LIST (QUOTE QUOTE) :-D.P2400)) (CAR :-D.Y2399)) (SYNTAX-ERROR :-D.X2398))) (SYNTAX-DISPATCH :-D.X2398 (QUOTE (ANY)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.X2396))) (SYNTAX-DISPATCH :-D.X2396 (QUOTE (VECTOR EACH ANY)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.X2394))) (SYNTAX-DISPATCH :-D.X2394 (QUOTE (PAIR (ANY) ANY)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.X2392))) (SYNTAX-DISPATCH :-D.X2392 (QUOTE (PAIR (FREE-ID . 2) PAIR (ANY) ATOM)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.X2390))) (SYNTAX-DISPATCH :-D.X2390 (QUOTE (PAIR (PAIR (FREE-ID . 1) PAIR (ANY) ATOM) ANY)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.X2388))) (SYNTAX-DISPATCH :-D.X2388 (QUOTE (PAIR (FREE-ID . 0) PAIR (ANY) ATOM)) (VECTOR (QUOTE UNQUOTE) (QUOTE UNQUOTE-SPLICING) (QUOTE QUASIQUOTE))))) :-D.P2386)))) (LAMBDA (:-D.X2313) ((LAMBDA (:-D.X2314) ((LAMBDA (:-D.Y2315) (IF :-D.Y2315 ((LAMBDA (:-D.-2316 :-D.E2317) (:-D.GEN2312 :-D.E2317 (QUOTE 0))) (CAR :-D.Y2315) (CADR :-D.Y2315)) (SYNTAX-ERROR :-D.X2314))) (SYNTAX-DISPATCH :-D.X2314 (QUOTE (PAIR (ANY) PAIR (ANY) ATOM)) (QUOTE #())))) :-D.X2313))))
