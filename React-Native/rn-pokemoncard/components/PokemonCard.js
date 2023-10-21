import { StyleSheet, Text, View, Platform, Image } from "react-native";

const getTypeDetails = (type) => {
  switch (type.toLowerCase()) {
    case "electric":
      return { borderColor: "#FFD700", emoji: "⚡️" };
    case "water":
      return { borderColor: "#6493EA", emoji: "💧" };
    case "fire":
      return { borderColor: "#FF5733", emoji: "🔥" };
    case "grass":
      return { borderColor: "#66CC66", emoji: "🌿" };
    default:
      return { borderColor: "#A0A0A0", emoji: "❓" };
  }
};

export default function PokemonCard({
  name,
  image,
  type,
  hp,
  moves,
  weaknesses,
}) {
  const { borderColor, emoji } = getTypeDetails(type);

  return (
    <View style={styles.card}>
      <View style={styles.nameWrapper}>
        <Text style={styles.name}>{name}</Text>
        <Text style={styles.hp}>❤️❤️❤️ {hp}</Text>
      </View>

      <Image
        source={image}
        style={styles.img}
        accessibilityLabel={`${name} pokemon`}
        resizeMode="contain"
      />

      <View style={styles.typeWrapper}>
        <View style={[styles.badges, { borderColor }]}>
          <Text style={styles.emoji}>{emoji}</Text>
          <Text style={styles.type}>{type}</Text>
        </View>
      </View>

      <View style={styles.movesWrapper}>
        <Text style={styles.move}>Moves : {moves.join(", ")}</Text>
      </View>

      <View style={styles.weakWrapper}>
        <Text style={styles.weak}>Weakness : {weaknesses.join(", ")}</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#fff",
    borderRadius: 16,
    borderWidth: 2,
    padding: 16,
    margin: 16,
    marginBottom: 5,
    elevation: Platform === "android" ? 4 : 0,

    // untuk belajar saja, kebetulan saya menggunakan android dan ios
    // ...Platform.select({
    //   ios: {
    //     shadowOffset: {
    //       width: 2,
    //       height: 2,
    //     },
    //     shadowColor: "#333",
    //     shadowOpacity: 0.3,
    //     shadowRadius: 4,
    //   },
    //   android: {
    //     elevation: 4,
    //   },
    // }),
  },

  nameWrapper: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    marginBottom: 16,
  },
  name: {
    fontSize: 24,
    fontWeight: "bold",
  },
  hp: {
    fontSize: 16,
    fontWeight: "bold",
  },

  img: {
    width: "100%",
    height: 200,
    marginBottom: 16,
  },

  typeWrapper: {
    alignItems: "center",
    marginBottom: 16,
  },
  badges: {
    flexDirection: "row",
    alignItems: "center",
    borderWidth: 4,
    borderRadius: 20,
    paddingVertical: 6,
    paddingHorizontal: 12,
  },
  emoji: {
    fontSize: 24,
    marginRight: 10,
  },
  type: {
    fontSize: 24,
    fontWeight: "bold",
  },

  movesWrapper: {
    marginBottom: 16,
  },
  move: {
    fontSize: 18,
    fontWeight: "bold",
  },

  weak: {
    fontSize: 15,
    fontWeight: "bold",
  },
});
