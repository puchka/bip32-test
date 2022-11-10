(ns core
  (:require
    [bips.bip32 :as bip32]
    [clojure.pprint :as pp]))


(defn -main
  [args]
  (println "(bip32/derive-master-node \"000102030405060708090a0b0c0d0e0f\")")
  (pp/pprint (bip32/derive-master-node "000102030405060708090a0b0c0d0e0f"))
  ;; => {:private-key "e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35"
  ;;    :public-key "0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2"
  ;;    :chain-code "873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508"
  ;;    :depth 0}
  (println)
  (println "(bip32/CKDpriv {:private-key \"e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35\"
               :public-key \"0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2\"
               :chain-code \"873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508\"
               :depth 0} 0)")
  (pp/pprint
   (bip32/CKDpriv {:private-key "e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35"
                   :public-key "0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2"
                   :chain-code "873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508"

                   :depth 0} 0))
  ;; => {:private-key "4e2cdcf2f14e802810e878cf9e6411fc4e712edf19a06bcfcc5d5572e489a3b7"
  ;;    :chain-code "d323f1be5af39a2d2f08f5e8f664633849653dbe329802e9847cfc85f8d7b52a"
  ;;    :index 0
  ;;    :depth 1}
  (println "(bip32/CKDpub {:private-key \"e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35\"
              :public-key \"0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2\"
              :chain-code \"873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508\"
              :depth 0} 0)")
  (pp/pprint
   (bip32/CKDpub {:private-key "e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35"
                  :public-key "0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2"
                  :chain-code "873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508"

                  :depth 0} 0))
  ;; => {:public-key "027c4b09ffb985c298afe7e5813266cbfcb7780b480ac294b0b43dc21f2be3d13c"
  ;;    :chain-code "d323f1be5af39a2d2f08f5e8f664633849653dbe329802e9847cfc85f8d7b52a"
  ;;    :index 0
  ;;    :depth 1}
  (println)
  (println "(bip32/N {:private-key \"4e2cdcf2f14e802810e878cf9e6411fc4e712edf19a06bcfcc5d5572e489a3b7\"
             :chain-code \"d323f1be5af39a2d2f08f5e8f664633849653dbe329802e9847cfc85f8d7b52a\"
             :index 0
             :depth 1})")
  (pp/pprint
   (bip32/N {:private-key "4e2cdcf2f14e802810e878cf9e6411fc4e712edf19a06bcfcc5d5572e489a3b7"
             :chain-code "d323f1be5af39a2d2f08f5e8f664633849653dbe329802e9847cfc85f8d7b52a"
             :index 0
             :depth 1}))
  ;; => {:public-key "027c4b09ffb985c298afe7e5813266cbfcb7780b480ac294b0b43dc21f2be3d13c"
  ;;     :chain-code "d323f1be5af39a2d2f08f5e8f664633849653dbe329802e9847cfc85f8d7b52a"
  ;;     :index 0
  ;;     :depth 1}
  (println)
  (println "(bip32/derive-path \"000102030405060708090a0b0c0d0e0f\" \"m/0H/1/2H/2/1000000000\" :private)")
  (pp/pprint
   (bip32/derive-path "000102030405060708090a0b0c0d0e0f" "m/0H/1/2H/2/1000000000" :private))
  ;; => {:private-key "471b76e389e528d6de6d816857e012c5455051cad6660850e58372a6c3e6e7c8"
  ;;     :chain-code "c783e67b921d2beb8f6b389cc646d7263b4145701dadd2161548a8b078e65e9e"
  ;;     :index 1000000000
  ;;     :depth 5}
                      )
