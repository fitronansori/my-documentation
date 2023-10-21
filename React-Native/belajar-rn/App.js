import { useState } from "react";
import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View, Button, Modal } from "react-native";

export default function App() {
  const [modalVisible, setModalVisible] = useState(false);
  return (
    <View style={styles.container}>
      <View style={{ backgroundColor: "red" }}>
        <Button
          title="Open Modal"
          onPress={() => {
            setModalVisible(true);
          }}
        />

        <Modal
          animationType="slide"
          // transparent={true}
          visible={modalVisible}
          onRequestClose={() => {
            setModalVisible(false);
          }}
          style={{ backgroundColor: "red" }}
        >
          <View style={{ backgroundColor: "red" }}>
            <Text>Hello World</Text>
            <Button
              title="Close Modal"
              onPress={() => {
                setModalVisible(false);
              }}
            />
          </View>
        </Modal>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "blue",
    alignItems: "center",
    justifyContent: "center",
  },
});
